package org.example.structura.ConsumerData.BazPolyClient.ConsumerData;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Balance {
    @JsonProperty("Amount")
    private String Amount;
    @JsonProperty("Narrative")
    private String Narrative;
}
