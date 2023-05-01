package com.calixto.hexagonal.adapters.out.repository.entity;

import lombok.Data;

@Data
public class AddressEntity {
    private String logradouro;
    private String localidade;
    private String uf;    
}
