package com.pharmacia.pharma.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacia.pharma.model.Categoria;
import com.pharmacia.pharma.repository.categoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class controllerCategoria {

	@Autowired
	private categoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<Object> buscarTudo () {
		List<Categoria> listCat = repository.findAll();
		
		if (listCat.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listCat);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> GetById (@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
		
	
	@GetMapping("categoria/{tarja}")
	public ResponseEntity<List<Categoria>> GetByTarja(@PathVariable String tarja){
		return ResponseEntity.ok(repository.findAllByTarjaContainingIgnoreCase(tarja));
	}
	
	@PostMapping
	public ResponseEntity<Categoria> post (@RequestBody Categoria Categoria){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(Categoria));
		
	}
	
	@PutMapping
	public ResponseEntity<Categoria> put (@RequestBody Categoria Categoria){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(Categoria));
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	}

