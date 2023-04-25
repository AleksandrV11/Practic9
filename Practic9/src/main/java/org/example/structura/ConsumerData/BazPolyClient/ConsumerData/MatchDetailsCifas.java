package org.example.structura.ConsumerData.BazPolyClient.ConsumerData;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MatchDetailsCifas {
    @JsonProperty("StreetMatchLevel")
    private String StreetMatchLevel;
    @JsonProperty("HouseMatchLevel")
    private String HouseMatchLevel;
    @JsonProperty("BureauRefCategory")
    private String BureauRefCategory;
    @JsonProperty("MatchTo")
    private String MatchTo;
    @JsonProperty("MatchType")
    private String MatchType;
}
