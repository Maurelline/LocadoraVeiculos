package br.com.uniesp.locadoraveiculos.service.impl;

import br.com.uniesp.locadoraveiculos.adapter.repository.ClienteRepository;
import br.com.uniesp.locadoraveiculos.domain.dto.ClienteDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.ClienteEntity;
import br.com.uniesp.locadoraveiculos.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository repository;

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


        entity = repository.save(entity);

        return entity;
    }
}
