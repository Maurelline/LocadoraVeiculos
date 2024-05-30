package br.com.uniesp.locadoraveiculos.adapter.repository;

import br.com.uniesp.locadoraveiculos.domain.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientePfRepository extends JpaRepository<ClienteEntity, Long> {
}
