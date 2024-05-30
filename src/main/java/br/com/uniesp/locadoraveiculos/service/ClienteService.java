package br.com.uniesp.locadoraveiculos.service;

import br.com.uniesp.locadoraveiculos.domain.dto.ClienteDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.ClienteEntity;

import java.util.List;

public interface ClienteService {
    ClienteEntity criar(ClienteDTO dto);

    List<ClienteEntity> listarClientes();

    ClienteEntity buscarCliente(Long id);

    void apagarCliente(Long id);
}
