package br.com.uniesp.locadoraveiculos.domain.dto;

public class ClientePfDTO extends ClienteDTO {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
