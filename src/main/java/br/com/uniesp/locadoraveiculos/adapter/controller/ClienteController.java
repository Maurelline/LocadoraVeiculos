package br.com.uniesp.locadoraveiculos.adapter.controller;


import br.com.uniesp.locadoraveiculos.domain.dto.ClienteDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.ClienteEntity;
import br.com.uniesp.locadoraveiculos.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    ResponseEntity<ClienteEntity> criarCliente(@RequestBody ClienteDTO cliente) {
        var response = clienteService.criar(cliente);
        return ResponseEntity.ok(response);
    }


}
