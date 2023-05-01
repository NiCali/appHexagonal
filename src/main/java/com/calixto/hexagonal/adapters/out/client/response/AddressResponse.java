package com.calixto.hexagonal.adapters.out.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressResponse {
    @JsonProperty(value = "logradouro")
    private String logradouro;
    @JsonProperty(value = "localidade")
    private String localidade;
    @JsonProperty(value = "uf")
    private String uf;

}
