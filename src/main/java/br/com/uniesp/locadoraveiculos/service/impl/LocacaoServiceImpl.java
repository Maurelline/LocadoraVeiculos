package br.com.uniesp.locadoraveiculos.service.impl;

import br.com.uniesp.locadoraveiculos.adapter.repository.LocacaoRepository;
import br.com.uniesp.locadoraveiculos.domain.entity.LocacaoEntity;
import br.com.uniesp.locadoraveiculos.domain.enums.StatusLocacao;
import br.com.uniesp.locadoraveiculos.service.LocacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LocacaoServiceImpl implements LocacaoService {

    private final LocacaoRepository locacaoRepository;

    @Override
    public LocacaoEntity locarVeiculo(Long idCliente, Long idVeiculo, int dias) {
        var locacaoEntity = new LocacaoEntity();
        locacaoEntity.setIdCliente(idCliente);
        locacaoEntity.setIdVeiculo(idVeiculo);
        locacaoEntity.setLocacao(StatusLocacao.ANDAMENTO);
        locacaoEntity.setDataLocacao(LocalDate.now());
        locacaoEntity.setDataDevolucaoCombinada(LocalDate.now().plusDays(dias));

        locacaoEntity = locacaoRepository.save(locacaoEntity);
        return locacaoEntity;
    }

    @Override
    public List<LocacaoEntity> listarLocacoes() {
        return locacaoRepository.findAll();
    }

    @Override
    public List<LocacaoEntity> listarLocacoesCliente(Long idCliente) {
        return locacaoRepository.findAllByIdCliente(idCliente);
    }

    @Override
    public LocacaoEntity finalizarLocacao(Long idLocacao) {
        var locacaoEntity = locacaoRepository.findById(idLocacao).get();
        locacaoEntity.setDataDevolucaoRecebido(LocalDate.now());
        locacaoEntity.setLocacao(StatusLocacao.CONCLUIDO);

        locacaoEntity = locacaoRepository.save(locacaoEntity);
        return locacaoEntity;
    }
}
