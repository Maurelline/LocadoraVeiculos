package br.com.uniesp.locadoraveiculos.service;

import br.com.uniesp.locadoraveiculos.domain.dto.ClienteDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.ClienteEntity;

public interface ClienteService {
    ClienteEntity criar(ClienteDTO dto);
}
