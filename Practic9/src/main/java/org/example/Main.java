package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.example.structura.ConsumerData.BazPolyClient.Client.Client;
import org.example.structura.ConsumerData.BazPolyClient.Client.ConsumerData;
import org.example.structura.ConsumerData.BazPolyClient.ConsumerData.AccountBalances;
import org.example.structura.ConsumerData.BazPolyClient.ConsumerData.Balance;
import org.example.structura.ConsumerData.BazPolyClient.ConsumerData.CAISDetails;
import org.example.structura.ConsumerData.BazPolyClient.ConsumerData.CreditLimit;


import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.ToIntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    public static <optionalCAISDetails> void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectMapper objectMapper = new ObjectMapper();

        File file = new File("src/main/resources/practic9.json");
        Client client = objectMapper.readValue(file, Client.class);
        List<Integer> deals = client.getConsumerData().getCAIS().stream()
                .flatMap(s -> s.getCAISDetails().stream()
                        .map(CAISDetails::getCreditLimit)
                        .filter(Objects::nonNull)
                        .map(CreditLimit::getAmount))
                .map(s -> s.substring(1))
                .map(Integer::parseInt)
                .filter(s -> s > 0)
                .collect(Collectors.toList());
        Integer howManyDeals = deals.size();
        System.out.println("  Количество сделок не с нулевым кредитным лимитом :  " + howManyDeals);


        Integer maxBallance = client.getConsumerData().getCAIS().stream()
                .flatMap(s -> s.getCAISDetails().stream())
                .map(CAISDetails::getBalance)
                .filter(Objects::nonNull)
                .map(Balance::getAmount)
                .filter(Objects::nonNull)
                .filter(s -> s.length() != 0)
                .map(s -> s.substring(1))
                .map(Integer::parseInt)
                .max(Integer::compareTo).get();
        System.out.println("  Mаксимальный баланс по всем сделкам :  " + maxBallance);


        Optional<CAISDetails> optionalCAISDetails = client.getConsumerData().getCAIS().stream()
                .flatMap(s -> s.getCAISDetails().stream()
                        .filter(a -> (LocalDate.parse(a.getCAISAccStartDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd"))
                                .isAfter(LocalDate.now().minusMonths(18))))
                        .filter(a -> a.getCreditLimit() != null)
                        .filter(a -> a.getCreditLimit().getAmount().length() != 0)
                )
                .max(Comparator.comparing(Main::transform));
        CAISDetails details = optionalCAISDetails.get();
        String accountType = details.getAccountType();
        System.out.println("  Тип сделки с Max кредитным лимитом за 1.5 года :  " + accountType);


        Integer optional = Math.toIntExact(client.getConsumerData().getCAIS().stream()
                .flatMap(s -> s.getCAISDetails().stream())
                .filter(a -> (LocalDate.parse(a.getCAISAccStartDate())
                        .isAfter(LocalDate.now().minusYears(2))))
                .filter(a -> a.getAccountBalances() != null)
                .flatMap(a -> a.getAccountBalances().stream().limit(workingWithDeadlines(a)))
                .map(AccountBalances::getStatus)
                .filter(b -> !b.equals("U"))
                .map(Integer::parseInt)
                .filter(b -> b > 0)
                .count());
        System.out.println("  Kоличество обновлений с просрочкой : " + optional);
    }

    private static long workingWithDeadlines(CAISDetails caisDetails) {
        LocalDate localDateStart = (LocalDate.parse(caisDetails
                .getCAISAccStartDate()));
        LocalDate localDateMinusYearHalf = (LocalDate.now().minusMonths(18));
        LocalDate lastUpdate = null;
        long months;
        if (caisDetails.getSettlementDate() != null) {
            lastUpdate = (LocalDate.parse(caisDetails.getSettlementDate()));
        }
        if (caisDetails.getSettlementDate() == null) {
            lastUpdate = (LocalDate.parse(caisDetails.getLastUpdatedDate()));
        }
        boolean prov = true;
        if (localDateStart.isAfter(localDateMinusYearHalf) == prov) {
            Integer fromTodayToStart = Math.toIntExact(ChronoUnit.MONTHS.between(localDateStart, LocalDate.now()));
            Integer fromTodayToUpdate = Math.toIntExact(ChronoUnit.MONTHS.between(lastUpdate, LocalDate.now()));
            months = fromTodayToStart - fromTodayToUpdate;
            return months;
        }
        if (localDateStart.isAfter(localDateMinusYearHalf) != prov) {
            Integer fromTodayToStart = Math.toIntExact(ChronoUnit.MONTHS.between(localDateStart, LocalDate.now()));
            Integer fromTodayToUpdate = Math.toIntExact(ChronoUnit.MONTHS.between(lastUpdate, LocalDate.now()));

            Integer fromTodayToMinusTerm = Math.toIntExact(ChronoUnit.MONTHS.between(localDateStart, localDateMinusYearHalf));
            months = fromTodayToStart - fromTodayToUpdate - fromTodayToMinusTerm;
            return months;
        }
        return 0;
    }


    private static Integer transform(CAISDetails caisDetails) {
        String string = caisDetails.getCreditLimit().getAmount()
                .substring(1);
        Integer integer = Integer.parseInt(string);
        return integer;
    }


}

























