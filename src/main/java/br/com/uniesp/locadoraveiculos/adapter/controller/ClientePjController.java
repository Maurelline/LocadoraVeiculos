package br.com.uniesp.locadoraveiculos.adapter.controller;

import br.com.uniesp.locadoraveiculos.domain.dto.ClientePjDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.ClientePJ;
import br.com.uniesp.locadoraveiculos.service.ClientePjService;
import br.com.uniesp.locadoraveiculos.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/clientes")
public class ClientePjController {
    @Autowired
    private ClientePjService clientePjService;

    @PostMapping
    ResponseEntity<ClientePJ> criarPjCLiente(@RequestBody ClientePjDTO clientePj){
        var responsePj = clientePjService.criar(clientePj);

        return ResponseEntity.ok((ClientePJ) responsePj);
    }
}
