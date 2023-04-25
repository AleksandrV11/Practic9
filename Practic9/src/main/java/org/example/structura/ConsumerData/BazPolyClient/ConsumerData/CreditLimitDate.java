package org.example.structura.ConsumerData.BazPolyClient.ConsumerData;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CreditLimitDate {
    @JsonProperty("CreditLimitDateMM")
    private String CreditLimitDateMM;
    @JsonProperty("CreditLimitDateYY")
    private String CreditLimitDateYY;
}
