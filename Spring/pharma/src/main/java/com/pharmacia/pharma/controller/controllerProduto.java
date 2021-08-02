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

import com.pharmacia.pharma.model.Produto;
import com.pharmacia.pharma.repository.produtoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class controllerProduto {

	@Autowired
	private produtoRepository repository;
	
	@GetMapping
	public ResponseEntity<Object> buscarTudo () {
		List<Produto> listProd = repository.findAll();
		
		if (listProd.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listProd);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> GetById (@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	
	}
	@GetMapping("categoria/{nome}")
	public ResponseEntity<List<Produto>> GetByNome(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Produto> post (@RequestBody Produto Produto){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(Produto));
	}
	
	@PutMapping
	public ResponseEntity<Produto> put (@RequestBody Produto Produto){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(Produto));
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
