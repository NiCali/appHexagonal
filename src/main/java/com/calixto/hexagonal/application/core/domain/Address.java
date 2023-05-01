package com.calixto.hexagonal.application.core.domain;

public class Address {
    private String logradouro;

    private String localidade;

    private String uf;

    public Address(String logradouro, String localidade, String uf) {
        this.logradouro = logradouro;
        this.localidade = localidade;
        this.uf = uf;
    }

    public Address() {
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

}
