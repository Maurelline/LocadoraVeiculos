package br.com.uniesp.locadoraveiculos.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class VeiculosDTO {

    @NotBlank(message = "A placa não pode estar em branco")
    @Size(min = 7, max = 8, message = "A placa deve ter entre 7 e 8 caracteres")
    private String placa;

    @NotBlank(message = "O modelo não pode estar em branco")
    @Size(max = 100, message = "O modelo deve ter no máximo 100 caracteres")
    private String modelo;

    @NotBlank(message = "A cor não pode estar em branco")
    @Size(max = 50, message = "A cor deve ter no máximo 50 caracteres")
    private String cor;

    @Size(max = 255, message = "A descrição deve ter no máximo 255 caracteres")
    private String descricao;

    @NotBlank(message = "A categoria não pode estar em branco")
    @Size(max = 50, message = "A categoria deve ter no máximo 50 caracteres")
    private String categoria;

    @Positive(message = "O preço deve ser um valor positivo")
    private double preco;
}