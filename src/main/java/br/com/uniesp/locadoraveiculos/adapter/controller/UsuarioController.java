package br.com.uniesp.locadoraveiculos.adapter.controller;


import br.com.uniesp.locadoraveiculos.domain.dto.UsuarioDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.UsuarioEntity;
import br.com.uniesp.locadoraveiculos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    ResponseEntity<UsuarioEntity> criarUsuario(@RequestBody UsuarioDTO usuario) {
        var response = usuarioService.criar(usuario);
        return ResponseEntity.ok(response);
    }
}
