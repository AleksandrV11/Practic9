package org.example.structura.ConsumerData.BazPolyClient.ConsumerData;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AccountBalances {
    @JsonProperty("AccountBalance")
    private String AccountBalance;
    @JsonProperty("Status")
    private String Status;
}
