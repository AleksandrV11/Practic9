package org.example.structura.ConsumerData.BazPolyClient.ConsumerData;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Name {
    @JsonProperty("Title")
    private String Title;
    @JsonProperty("Forename")
    private String Forename;
    @JsonProperty("Surname")
    private String Surname;
}
