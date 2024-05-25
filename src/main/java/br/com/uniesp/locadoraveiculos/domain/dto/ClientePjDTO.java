package br.com.uniesp.locadoraveiculos.domain.dto;


public class ClientePjDTO extends ClienteDTO{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
