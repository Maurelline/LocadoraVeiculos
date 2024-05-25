package br.com.uniesp.locadoraveiculos.adapter.controller;

import br.com.uniesp.locadoraveiculos.domain.dto.VeiculosDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.VeiculosEntity;
import br.com.uniesp.locadoraveiculos.service.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/veiculos")
public class VeiculosController {
    @Autowired
    private VeiculosService veiculosService;

    @PostMapping
    ResponseEntity<VeiculosEntity> criarVeiculos(@RequestBody VeiculosDTO veiculos) {
        var response = veiculosService.criar(veiculos);
        return ResponseEntity.ok(response);
    }
}
