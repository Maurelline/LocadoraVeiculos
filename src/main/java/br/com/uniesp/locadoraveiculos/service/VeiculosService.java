package br.com.uniesp.locadoraveiculos.service;

import br.com.uniesp.locadoraveiculos.domain.dto.VeiculosDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.VeiculosEntity;

import java.util.List;

public interface VeiculosService {
    VeiculosEntity criar(VeiculosDTO dto);

    List<VeiculosEntity> listarVeiculos();

    VeiculosEntity buscarVeiculo(Long id);

    void apagarVeiculo(Long id);
}

