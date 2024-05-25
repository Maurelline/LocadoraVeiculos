package br.com.uniesp.locadoraveiculos.service;

import br.com.uniesp.locadoraveiculos.domain.dto.VeiculosDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.VeiculosEntity;

public interface VeiculosService {
    VeiculosEntity criar(VeiculosDTO dto);
}
