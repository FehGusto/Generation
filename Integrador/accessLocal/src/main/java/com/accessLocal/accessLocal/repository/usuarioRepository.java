package com.accessLocal.accessLocal.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accessLocal.accessLocal.model.Usuario;

@Repository
public interface usuarioRepository extends JpaRepository<Usuario, Long>{
	public List<Usuario> findAllByNomeCompletoContainingIgnoreCase (String nomeCompleto);


}
