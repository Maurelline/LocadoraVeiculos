package br.com.uniesp.locadoraveiculos.adapter.repository;

import br.com.uniesp.locadoraveiculos.domain.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {


}
