package br.com.uniesp.locadoraveiculos.service.impl;

import br.com.uniesp.locadoraveiculos.adapter.repository.ClientePjRepository;
import br.com.uniesp.locadoraveiculos.adapter.repository.ClienteRepository;
import br.com.uniesp.locadoraveiculos.domain.dto.ClienteDTO;
import br.com.uniesp.locadoraveiculos.domain.dto.ClientePjDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.ClienteEntity;
import br.com.uniesp.locadoraveiculos.domain.entity.ClientePJ;
import br.com.uniesp.locadoraveiculos.service.ClientePjService;
import br.com.uniesp.locadoraveiculos.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientePjServiceImpl implements ClientePjService {
    @Autowired
    private ClientePjRepository repositoryPj;

    @Override
    public ClientePJ criar(ClientePjDTO dto){
        var entityPj = new ClientePJ();
        entityPj.setNome(dto.getNome());
        entityPj.setEmail(dto.getEmail());
        entityPj.setTelefone(dto.getTelefone());
        entityPj.setCnpj(dto.getCnpj());
        entityPj.setEndereco(dto.getEndereco());
        entityPj.setCidade(dto.getCidade());
        entityPj.setEstado(dto.getEstado());
        entityPj.setCep(dto.getCep());

        entityPj = repositoryPj.save(entityPj);

        return entityPj;
    }
}
