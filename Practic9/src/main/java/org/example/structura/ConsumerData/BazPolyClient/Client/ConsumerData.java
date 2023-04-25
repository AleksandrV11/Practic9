package org.example.structura.ConsumerData.BazPolyClient.Client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.example.structura.ConsumerData.BazPolyClient.ConsumerData.CAIS;
import org.example.structura.ConsumerData.BazPolyClient.ConsumerData.CIFAS;

import java.util.List;

@Data
public class ConsumerData {
    @JsonProperty("CIFAS")
    private List<CIFAS> CIFAS;
    @JsonProperty("CAIS")
    private List<CAIS> CAIS;


}
