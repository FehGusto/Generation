package com.accessLocal.accessLocal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name = "tema")
public class Tema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTema;
	
	//TIPO USARIO (EX: EMPRESA, PCD E NAO PCD)  
	@NotNull
	@NotBlank
	@Size(min = 2 , max = 50)
	private String tipoUsuario;
	
	//O MESMO ENTRARA IRA INFORMAR QUAL DEFICIENCIA 
	//@NotNull - OPCIPNAL - CASO USUARIO NAO SEJA PCD
	//@NotBlank - OPCIONAL  "    "        "        "
	@Size(min = 2 , max = 90)
	private String tipoDeficiencia;
	
	//BUSCAR POR EXP. CONFORME DEFICIENCIAS
	//@NotNull
	@Size(min = 1 , max = 100000)
	private String experienciaUsuario;

	public long getIdTema() {
		return idTema;
	}

	public void setIdTema(long idTema) {
		this.idTema = idTema;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getTipoDeficiencia() {
		return tipoDeficiencia;
	}

	public void setTipoDeficiencia(String tipoDeficiencia) {
		this.tipoDeficiencia = tipoDeficiencia;
	}

	public String getExperienciaUsuario() {
		return experienciaUsuario;
	}

	public void setExperienciaUsuario(String experienciaUsuario) {
		this.experienciaUsuario = experienciaUsuario;
	}
	
	
	

	
	
	


	}
	
	
	
	
