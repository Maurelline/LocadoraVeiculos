package br.com.uniesp.locadoraveiculos.service;

import br.com.uniesp.locadoraveiculos.domain.dto.ClientePjDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.ClienteEntity;

public interface ClientePjService {
    ClienteEntity criar(ClientePjDTO dto);
}
