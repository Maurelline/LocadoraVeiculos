package br.com.uniesp.locadoraveiculos.adapter.controller;

import br.com.uniesp.locadoraveiculos.domain.entity.LocacaoEntity;
import br.com.uniesp.locadoraveiculos.service.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "v1/locacao")
public class LocacaoController {
    @Autowired
    private LocacaoService locacaoService;

    @PostMapping(value = "/cliente/{idCliente}/veiculo/{idVeiculo}/dias/{dias}")
    ResponseEntity<LocacaoEntity> locarVeiculo(@PathVariable Long idCliente, @PathVariable Long idVeiculo, @PathVariable int dias) {
        var response = locacaoService.locarVeiculo(idCliente, idVeiculo, dias);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    ResponseEntity<List<LocacaoEntity>> listarLocacoes() {
        var response = locacaoService.listarLocacoes();
        return ResponseEntity.ok(response);
    }

    @PutMapping(value = "/finalizar/{idLocacao}")
    ResponseEntity<LocacaoEntity> finalizarLocacao(@PathVariable Long idLocacao) {
        var response = locacaoService.finalizarLocacao(idLocacao);
        return ResponseEntity.ok(response);
    }
}
