package br.com.uniesp.locadoraveiculos.service;

import br.com.uniesp.locadoraveiculos.domain.dto.ClientePfDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.ClienteEntity;

public interface ClientePfService {
    ClienteEntity criar(ClientePfDTO dto);
}
