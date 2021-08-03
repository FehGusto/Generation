package com.accessLocal.accessLocal.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accessLocal.accessLocal.model.Tema;

@Repository
public interface temaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByTipoUsuarioContainingIgnoreCase (String tipoUsuario);

}
