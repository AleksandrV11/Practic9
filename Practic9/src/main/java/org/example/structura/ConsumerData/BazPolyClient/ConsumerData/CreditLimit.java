package org.example.structura.ConsumerData.BazPolyClient.ConsumerData;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CreditLimit {
    @JsonProperty("Amount")
    private String Amount;
    @JsonProperty("Caption")
    private String Caption;
}
