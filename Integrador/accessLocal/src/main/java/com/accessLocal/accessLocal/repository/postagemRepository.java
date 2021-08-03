package com.accessLocal.accessLocal.repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accessLocal.accessLocal.model.Post;

@Repository
public interface postagemRepository extends JpaRepository<Post, Long> {
	public List<Post> findAllByCategoriaEstabelecimentoContainingIgnoreCase (String categoriaEstabelecimento);

}
