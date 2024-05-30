package br.com.uniesp.locadoraveiculos.domain.entity;

import br.com.uniesp.locadoraveiculos.domain.enums.StatusLocacao;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "LOCACAO_ENTITY")
public class LocacaoEntity extends BaseEntity {
    private Long idCliente;
    private Long idVeiculo;
    private StatusLocacao locacao;
    private LocalDate dataLocacao;
    private LocalDate dataDevolucaoCombinada;
    private LocalDate dataDevolucaoRecebido;


    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Long idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public StatusLocacao getLocacao() {
        return locacao;
    }

    public void setLocacao(StatusLocacao locacao) {
        this.locacao = locacao;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDate getDataDevolucaoCombinada() {
        return dataDevolucaoCombinada;
    }

    public void setDataDevolucaoCombinada(LocalDate dataDevolucaoCombinada) {
        this.dataDevolucaoCombinada = dataDevolucaoCombinada;
    }

    public LocalDate getDataDevolucaoRecebido() {
        return dataDevolucaoRecebido;
    }

    public void setDataDevolucaoRecebido(LocalDate dataDevolucaoRecebido) {
        this.dataDevolucaoRecebido = dataDevolucaoRecebido;
    }
}
