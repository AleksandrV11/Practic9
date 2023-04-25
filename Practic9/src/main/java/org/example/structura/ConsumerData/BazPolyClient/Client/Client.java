package org.example.structura.ConsumerData.BazPolyClient.Client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Client {
    @JsonProperty("ConsumerData")
  private ConsumerData consumerData;
}
