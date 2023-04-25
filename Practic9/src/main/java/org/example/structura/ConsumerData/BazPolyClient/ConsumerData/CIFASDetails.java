package org.example.structura.ConsumerData.BazPolyClient.ConsumerData;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CIFASDetails {
    @JsonProperty("MatchDetails")
    private MatchDetailsCifas MatchDetails;
    @JsonProperty("InformationSource")
    private String InformationSource;
    @JsonProperty("CIFASReference")
    private String CIFASReference;
    @JsonProperty("FraudCategory")
    private String FraudCategory;
    @JsonProperty("SupplyDate")
    private String SupplyDate;
    @JsonProperty("AndOtherLocations")
    private String AndOtherLocations;
    @JsonProperty("SupplyCompanyName")
    private String SupplyCompanyName;
    @JsonProperty("SubCategories")
    private String SubCategories;
    @JsonProperty("DateOfBirth")
    private String DateOfBirth;
    @JsonProperty("Product")
    private String Product;
    @JsonProperty("Name")
    private Name Name;
    @JsonProperty("Location")
    private LocationCifas LocationsCif;

}
