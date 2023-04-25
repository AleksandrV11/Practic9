package org.example.structura.ConsumerData.BazPolyClient.ConsumerData;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CardHistories {
    @JsonProperty("PrevStatementBal")
    private String PrevStatementBal;
    @JsonProperty("PromotionalRate")
    private String PromotionalRate;
    @JsonProperty("PaymentAmount")
    private String PaymentAmount;
    @JsonProperty("NumCashAdvances")
    private String NumCashAdvances;
    @JsonProperty("CashAdvanceAmount")
    private String CashAdvanceAmount;
}
