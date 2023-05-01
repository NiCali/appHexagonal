package com.calixto.hexagonal.adapters.in.controller.response;

import lombok.Data;

@Data
public class AddressResponse {
    private String logradouro;

    private String localidade;

    private String uf;
}
