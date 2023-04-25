package org.example.structura.ConsumerData.BazPolyClient.ConsumerData;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LocationCifas {
    @JsonProperty("HouseNumber")
    private String HouseNumber;
    @JsonProperty("Street")
    private String Street;
    @JsonProperty("PostTown")
    private String PostTown;
    @JsonProperty("County")
    private String County;
    @JsonProperty("Postcode")
    private String Postcode;
}
