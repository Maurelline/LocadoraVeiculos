package br.com.uniesp.locadoraveiculos.domain.entity;

import jakarta.persistence.Entity;

@Entity
public class CarroEntity extends VeiculosEntity{

    private int ano;

    private int Km;

    private boolean marca;

    private String cambio;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKm() {
        return Km;
    }

    public void setKm(int km) {
        Km = km;
    }

    public boolean isMarca() {
        return marca;
    }

    public void setMarca(boolean marca) {
        this.marca = marca;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }
}
