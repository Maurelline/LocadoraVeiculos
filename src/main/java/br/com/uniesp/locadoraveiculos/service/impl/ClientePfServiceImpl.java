package br.com.uniesp.locadoraveiculos.service.impl;

import br.com.uniesp.locadoraveiculos.adapter.repository.ClientePfRepository;
import br.com.uniesp.locadoraveiculos.domain.dto.ClientePfDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.ClientePf;
import br.com.uniesp.locadoraveiculos.service.ClientePfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientePfServiceImpl implements ClientePfService {
    @Autowired
    private ClientePfRepository clientePfRepository;

    @Override
    public ClientePf salvar(ClientePfDTO dto) {
        var entityPf = new ClientePf();
        entityPf.setNome(dto.getNome());
        entityPf.setEmail(dto.getEmail());
        entityPf.setTelefone(dto.getTelefone());
        entityPf.setCpf(dto.getCpf());
        entityPf.setEndereco(dto.getEndereco());
        entityPf.setCidade(dto.getCidade());
        entityPf.setEstado(dto.getEstado());
        entityPf.setCep(dto.getCep());

        clientePfRepository.save(entityPf);

        return entityPf;


    }
}
