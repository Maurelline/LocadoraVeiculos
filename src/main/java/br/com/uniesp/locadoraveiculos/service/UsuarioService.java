package br.com.uniesp.locadoraveiculos.service;

import br.com.uniesp.locadoraveiculos.domain.dto.UsuarioDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.UsuarioEntity;

public interface UsuarioService {
    UsuarioEntity criar(UsuarioDTO dto);
}
