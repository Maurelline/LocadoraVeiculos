package br.com.uniesp.locadoraveiculos.service.impl;

import br.com.uniesp.locadoraveiculos.adapter.repository.VeiculosRepository;
import br.com.uniesp.locadoraveiculos.domain.dto.CarroDTO;
import br.com.uniesp.locadoraveiculos.domain.dto.VeiculosDTO;
import br.com.uniesp.locadoraveiculos.domain.entity.CarroEntity;
import br.com.uniesp.locadoraveiculos.domain.entity.VeiculosEntity;
import br.com.uniesp.locadoraveiculos.service.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculosServiceImpl implements VeiculosService {
    @Autowired
    private VeiculosRepository repository;

    @Override
    public VeiculosEntity criar(VeiculosDTO dto){
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
    public CarroEntity criarCarro(CarroDTO dto) {
        return null;
    }
}
