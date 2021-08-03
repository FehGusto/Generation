package com.accessLocal.accessLocal.controller;

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

import com.accessLocal.accessLocal.model.Usuario;
import com.accessLocal.accessLocal.repository.usuarioRepository;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class controllerUsuario {
	
	@Autowired
	private usuarioRepository repository;
	
	@GetMapping
	public ResponseEntity<Object> buscarTudo () {
		List<Usuario> listUser = repository.findAll();
		
		if (listUser.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listUser);
		}
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> GetById (@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/usuario/{nomeCompleto}")
	public ResponseEntity<List<Usuario>> GetByNome(@PathVariable String nomeCompleto){
		return ResponseEntity.ok(repository.findAllByNomeCompletoContainingIgnoreCase(nomeCompleto));
	
	}
	
	@PostMapping
	public ResponseEntity<Usuario> post (@RequestBody Usuario Usuario){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(Usuario));
		
	}
	
	@PutMapping("/put")
	public ResponseEntity<Usuario> put (@RequestBody Usuario Usuario){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(Usuario));
		
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}


}
