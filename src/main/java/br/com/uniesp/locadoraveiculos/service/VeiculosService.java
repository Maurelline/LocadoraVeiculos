package br.com.uniesp.locadoraveiculos.service;

import br.com.uniesp.locadoraveiculos.domain.dto.CarroDTO;
import br.com.uniesp.locadoraveiculos.domain.dto.VeiculosDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.CarroEntity;
import br.com.uniesp.locadoraveiculos.domain.entity.VeiculosEntity;

public interface VeiculosService {
    VeiculosEntity criar(VeiculosDTO dto);
    CarroEntity criarCarro(CarroDTO dto);
}

