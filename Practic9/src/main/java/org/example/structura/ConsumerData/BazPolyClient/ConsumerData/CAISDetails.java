package org.example.structura.ConsumerData.BazPolyClient.ConsumerData;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CAISDetails {
    @JsonProperty("MatchDetails")
    private MatchDetailsCais MatchDetails;
    @JsonProperty("InformationSource")
    private String InformationSource;
    @JsonProperty("CreditLimit")
    private CreditLimit CreditLimit;
    @JsonProperty("Balance")
    private Balance Balance;
    @JsonProperty("AccountStatusCodes")
    private String AccountStatusCodes;
    @JsonProperty("Status1To2")
    private String Status1To2;
    @JsonProperty("StatusTo3")
    private String StatusTo3;
    @JsonProperty("NumOfMonthsHistory")
    private int NumOfMonthsHistory;
    @JsonProperty("CAISAccStartDate")
    private String CAISAccStartDate;
    @JsonProperty("SettlementDate")
    private String SettlementDate;
    @JsonProperty("SettleDateCaption")
    private String SettleDateCaption;
    @JsonProperty("LastUpdatedDate")
    private String LastUpdatedDate;
    @JsonProperty("BankFlag")
    private String BankFlag;
    @JsonProperty("WorstStatus")
    private String WorstStatus;
    @JsonProperty("OwnData")
    private String OwnData;
    @JsonProperty("RepaymentPeriod")
    private int RepaymentPeriod;
    @JsonProperty("Payment")
    private String Payment;
    @JsonProperty("DateOfBirth")
    private String DateOfBirth;
    @JsonProperty("Sex")
    private String Sex;
    @JsonProperty("PaymentFrequency")
    private String PaymentFrequency;
    @JsonProperty("AccountStatus")
    private String AccountStatus;
    @JsonProperty("NumAddInfoBlocks")
    private int NumAddInfoBlocks;
    @JsonProperty("NumAccountBalances")
    private int NumAccountBalances;
    @JsonProperty("AccountBalances")
    private List<AccountBalances> AccountBalances;
    @JsonProperty("NumCardHistories")
    private int NumCardHistories;
    @JsonProperty("CardHistories")
    private List<CardHistories> CardHistories;
    @JsonProperty("NumCreditLimChngs")
    private int NumCreditLimChngs;
    @JsonProperty("CredLimitHistories")
    private List<CredLimitHistories> CredLimitHistories;
    @JsonProperty("NumStatuses")
    private int NumStatuses;
    @JsonProperty("CompanyType")
    private String CompanyType;
    @JsonProperty("AccountType")
    private String AccountType;
    @JsonProperty("Name")
    private Name Name;
    @JsonProperty("Location")
    private LocationCais LocationsCais;


}
