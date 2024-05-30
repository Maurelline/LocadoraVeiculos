package br.com.uniesp.locadoraveiculos.adapter.repository;

import br.com.uniesp.locadoraveiculos.domain.entity.LocacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocacaoRepository extends JpaRepository<LocacaoEntity, Long> {
}
