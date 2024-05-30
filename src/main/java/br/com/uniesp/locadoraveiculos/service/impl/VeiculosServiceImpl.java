package br.com.uniesp.locadoraveiculos.service.impl;

import br.com.uniesp.locadoraveiculos.adapter.repository.VeiculosRepository;
import br.com.uniesp.locadoraveiculos.domain.dto.VeiculosDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.VeiculosEntity;
import br.com.uniesp.locadoraveiculos.service.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculosServiceImpl implements VeiculosService {
    @Autowired
    private VeiculosRepository repository;

    @Override
    public VeiculosEntity criar(VeiculosDTO dto) {
        var entity = new VeiculosEntity();
        entity.setPlaca(dto.getPlaca());
        entity.setModelo(dto.getModelo());
        entity.setCor(dto.getCor());
        entity.setDescricao(dto.getDescricao());
        entity.setCategoria(dto.getCategoria());
        entity.setPreco(dto.getPreco());

        entity = repository.save(entity);

        return entity;
    }

    @Override
    public List<VeiculosEntity> listarVeiculos() {
        var veiculos = repository.findAll();
        return veiculos;
    }

    @Override
    public VeiculosEntity buscarVeiculo(Long id) {
        var veiculo = repository.findById(id).get();
        return veiculo;
    }

    @Override
    public void apagarVeiculo(Long id) {
        repository.deleteById(id);
    }
}
