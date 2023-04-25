package org.example.structura.ConsumerData.BazPolyClient.ConsumerData;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MatchDetailsCais {
    @JsonProperty("StreetMatchLevel")
    private String StreetMatchLevel;
    @JsonProperty("HouseMatchLevel")
    private String HouseMatchLevel;
    @JsonProperty("ForenameMatchLevel")
    private String ForenameMatchLevel;
    @JsonProperty("SurnameMatchLevel")
    private String SurnameMatchLevel;
    @JsonProperty("BureauRefCategory")
    private String BureauRefCategory;
    @JsonProperty("MatchTo")
    private String MatchTo;
    @JsonProperty("MatchType")
    private String MatchType;
}
