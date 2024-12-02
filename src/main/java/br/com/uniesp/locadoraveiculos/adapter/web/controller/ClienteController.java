package br.com.uniesp.locadoraveiculos.adapter.web.controller;


import br.com.uniesp.locadoraveiculos.domain.dto.ClienteDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.ClienteEntity;
import br.com.uniesp.locadoraveiculos.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "v1/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    ResponseEntity<ClienteEntity> criarCliente(@Valid @RequestBody ClienteDTO cliente) {
        var response = clienteService.criar(cliente);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    ResponseEntity<List<ClienteEntity>> listarClientes() {
        var response = clienteService.listarClientes();
        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/{id}")
    ResponseEntity<ClienteEntity> buscarCliente(@PathVariable Long id) {
        var response = clienteService.buscarCliente(id);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping(value = "/{id}")
    ResponseEntity<ClienteEntity> apagarCliente(@PathVariable Long id) {
        clienteService.apagarCliente(id);
        return ResponseEntity.ok(null);
    }
}
