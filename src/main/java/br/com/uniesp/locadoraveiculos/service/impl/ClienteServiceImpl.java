package br.com.uniesp.locadoraveiculos.service.impl;

import br.com.uniesp.locadoraveiculos.adapter.repository.ClienteRepository;
import br.com.uniesp.locadoraveiculos.domain.dto.ClienteDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.ClienteEntity;
import br.com.uniesp.locadoraveiculos.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository repository;

    @Override
    public ClienteEntity criar(ClienteDTO dto) {
        var entity = new ClienteEntity();
        entity.setNome(dto.getNome());
        entity.setEmail(dto.getEmail());
        entity.setTelefone(dto.getTelefone());
        entity.setEndereco(dto.getEndereco());
        entity.setCidade(dto.getCidade());
        entity.setEstado(dto.getEstado());
        entity.setCep(dto.getCep());
        entity.setNumeroDocumento(dto.getNumeroDocumento());

        entity = repository.save(entity);

        return entity;
    }

    @Override
    public List<ClienteEntity> listarClientes() {
        var clientes = repository.findAll();
        return clientes;
    }

    @Override
    public ClienteEntity buscarCliente(Long id) {
        var cliente = repository.findById(id).get();
        return cliente;
    }

    @Override
    public void apagarCliente(Long id) {
        repository.deleteById(id);
    }
}
