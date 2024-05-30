package br.com.uniesp.locadoraveiculos.service;

import br.com.uniesp.locadoraveiculos.domain.dto.ClientePfDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.ClienteEntity;
import br.com.uniesp.locadoraveiculos.domain.entity.ClientePf;

public interface ClientePfService {
    ClientePf salvar(ClientePfDTO dto);
}
