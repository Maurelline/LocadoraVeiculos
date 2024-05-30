package br.com.uniesp.locadoraveiculos.adapter.controller;

import br.com.uniesp.locadoraveiculos.domain.dto.ClientePfDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.ClientePf;
import br.com.uniesp.locadoraveiculos.service.ClientePfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "v1/clientes")
public class ClientePfController{
    @Autowired
    private ClientePfService clientePfService;

    @PostMapping
    ResponseEntity<ClientePf> criarPfCliente(@RequestBody ClientePfDTO clientepf){
        var responsePf = clientePfService.salvar(clientepf);
        return ResponseEntity.ok((ClientePf) responsePf);
    }
}
