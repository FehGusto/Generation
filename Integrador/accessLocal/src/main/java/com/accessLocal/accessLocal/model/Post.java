package com.accessLocal.accessLocal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Post")
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPost;
	
	@NotNull
	@Size(min = 5 , max = 1000)
	private String categoriaEstabelecimento;
	
	@NotNull
	@Size(min = 5 , max = 1000)
	private String tipoEstabelecimento;
	
	@NotNull
	@Size(min = 1, max = 1)
	private int avalicao;
	
	@NotNull
	@Size(min = 5 , max = 1000)
	private String comentario;

	public long getIdPost() {
		return idPost;
	}

	public void setIdPost(long idPost) {
		this.idPost = idPost;
	}

	public String getCategoriaEstabelecimento() {
		return categoriaEstabelecimento;
	}

	public void setCategoriaEstabelecimento(String categoriaEstabelecimento) {
		this.categoriaEstabelecimento = categoriaEstabelecimento;
	}

	public String getTipoEstabelecimento() {
		return tipoEstabelecimento;
	}

	public void setTipoEstabelecimento(String tipoEstabelecimento) {
		this.tipoEstabelecimento = tipoEstabelecimento;
	}

	public int getAvalicao() {
		return avalicao;
	}

	public void setAvalicao(int avalicao) {
		this.avalicao = avalicao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	

}
