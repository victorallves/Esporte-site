package br.com.magna.esporte.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_horarios")
public class Horario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idHorario;
	private String nome;
	private String esporte;
	private Integer numeroDeSets;

	public Horario() {

	}

	public Horario(String nome, String esporte, Integer numeroDeSets) {
		this.nome = nome;
		this.esporte = esporte;
		this.numeroDeSets = numeroDeSets;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEsporte() {
		return esporte;
	}

	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}

	public Integer getNumeroDeSets() {
		return numeroDeSets;
	}

	public void setNumeroDeSets(Integer numeroDeSets) {
		this.numeroDeSets = numeroDeSets;
	}

	public Integer getIdHorario() {
		return idHorario;
	}

	public void setIdHorario(Integer idHorario) {
		this.idHorario = idHorario;
	}

}
