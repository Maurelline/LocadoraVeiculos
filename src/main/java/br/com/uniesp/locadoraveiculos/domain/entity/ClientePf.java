package br.com.uniesp.locadoraveiculos.domain.entity;

import jakarta.persistence.Entity;

@Entity
public class ClientePf extends ClienteEntity{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
