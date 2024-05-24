package br.com.uniesp.locadoraveiculos.service.impl;

import br.com.uniesp.locadoraveiculos.adapter.repository.UsuarioRepository;
import br.com.uniesp.locadoraveiculos.domain.dto.UsuarioDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.UsuarioEntity;
import br.com.uniesp.locadoraveiculos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    @Override
    public UsuarioEntity criar(UsuarioDTO dto) {
        var entity = new UsuarioEntity();
        entity.setEmail(dto.getEmail());

        entity = repository.save(entity);

        return entity;
    }
}
