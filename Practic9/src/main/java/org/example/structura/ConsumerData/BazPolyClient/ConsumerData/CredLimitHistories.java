package org.example.structura.ConsumerData.BazPolyClient.ConsumerData;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CredLimitHistories {
    @JsonProperty("CreditLimitChange")
    private String CreditLimitChange;
    @JsonProperty("CreditLimitDate")
    private CreditLimitDate CreditLimitDate;


}
