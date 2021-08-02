package com.pharmacia.pharma.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.BatchSize;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Size(min = 4 , max = 1000)
	private String tarja;
	
	@NotBlank
	@Size(min = 5 , max = 1000)
	private String doencaTratada;
	

	@BatchSize(size= 100)
	private int estoqueUnidades;
	
	@ManyToOne
	@JsonIgnoreProperties("categoria")
	private Produto produto;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTarja() {
		return tarja;
	}

	public void setTarja(String tarja) {
		this.tarja = tarja;
	}

	public String getDoencaTratada() {
		return doencaTratada;
	}

	public void setDoencaTratada(String doencaTratada) {
		this.doencaTratada = doencaTratada;
	}

	public int getEstoqueUnidades() {
		return estoqueUnidades;
	}

	public void setEstoqueUnidades(int estoqueUnidades) {
		this.estoqueUnidades = estoqueUnidades;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
