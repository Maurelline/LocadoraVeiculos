package br.com.uniesp.locadoraveiculos.adapter.repository;

import br.com.uniesp.locadoraveiculos.domain.entity.ClientePJ;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientePjRepository extends JpaRepository<ClientePJ, Long> {
}
