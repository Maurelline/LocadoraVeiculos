package br.com.uniesp.locadoraveiculos.domain.entity;

import jakarta.persistence.Entity;

@Entity
public class ClientePJ extends ClienteEntity{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
