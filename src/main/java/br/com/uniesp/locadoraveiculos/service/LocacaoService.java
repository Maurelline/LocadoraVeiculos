package br.com.uniesp.locadoraveiculos.service;

import br.com.uniesp.locadoraveiculos.domain.entity.LocacaoEntity;

import java.util.List;

public interface LocacaoService {
    LocacaoEntity locarVeiculo(Long idCliente, Long idVeiculo, int dias);

    List<LocacaoEntity> listarLocacoes();

    List<LocacaoEntity> listarLocacoesCliente(Long idCliente);

    LocacaoEntity finalizarLocacao(Long idLocacao);
}
