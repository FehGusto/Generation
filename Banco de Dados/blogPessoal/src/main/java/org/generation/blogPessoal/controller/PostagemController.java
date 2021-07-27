package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vai")
public class PostagemController {
	
	@Autowired
	private PostagemRepository repository;
	
	@GetMapping("/todes")
	public ResponseEntity<Object> buscarTodes(){
		List<Postagem> listPost = repository.findAll();
		if (listPost.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listPost);
		}
		
		
	}
}
