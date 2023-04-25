package org.example.structura.ConsumerData.BazPolyClient.ConsumerData;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CIFAS {
    @JsonProperty("LocationIndicator")
    private String LocationIndicator;
    @JsonProperty("ApplicantIndicator")
    private String ApplicantIndicator;
    @JsonProperty("CIFASDetails")
    private List<CIFASDetails> CIFASDetails;
}
