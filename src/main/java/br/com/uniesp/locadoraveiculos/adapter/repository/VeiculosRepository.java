package br.com.uniesp.locadoraveiculos.adapter.repository;

import br.com.uniesp.locadoraveiculos.domain.entity.VeiculosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculosRepository extends JpaRepository<VeiculosEntity, Long> {
}
