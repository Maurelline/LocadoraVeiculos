package br.com.uniesp.locadoraveiculos.adapter.web.controller;

import br.com.uniesp.locadoraveiculos.domain.dto.VeiculosDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.VeiculosEntity;
import br.com.uniesp.locadoraveiculos.service.VeiculosService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "v1/veiculos")
public class VeiculosController {

    private final VeiculosService veiculosService;

    @PostMapping
    ResponseEntity<VeiculosEntity> criarVeiculos(@Valid @RequestBody VeiculosDTO veiculos) {
        var response = veiculosService.criar(veiculos);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    ResponseEntity<List<VeiculosEntity>> listarVeiculos() {
        var response = veiculosService.listarVeiculos();
        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/{id}")
    ResponseEntity<VeiculosEntity> buscarVeiculo(@PathVariable Long id) {
        var response = veiculosService.buscarVeiculo(id);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping(value = "/{id}")
    ResponseEntity<?> apagarVeiculo(@PathVariable Long id) {
        veiculosService.apagarVeiculo(id);
        return ResponseEntity.noContent().build();
    }
}
