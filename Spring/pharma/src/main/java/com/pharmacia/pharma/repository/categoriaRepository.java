package com.pharmacia.pharma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharmacia.pharma.model.Categoria;

@Repository
public interface categoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByTarjaContainingIgnoreCase (String tarja);

}
