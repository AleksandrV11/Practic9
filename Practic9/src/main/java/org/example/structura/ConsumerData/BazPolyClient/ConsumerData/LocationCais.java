package org.example.structura.ConsumerData.BazPolyClient.ConsumerData;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LocationCais {
    @JsonProperty("HouseNumber")
    private String HouseNumber;
    @JsonProperty("Street")
    private String Street;
    @JsonProperty("PostTown")
    private String PostTown;
    @JsonProperty("Postcode")
    private String Postcode;

}
