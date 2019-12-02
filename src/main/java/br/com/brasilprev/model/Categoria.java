package br.com.brasilprev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "BR_CATEGORIAS")
@SequenceGenerator(name = "BR_CATEGORIAS_SEQ", sequenceName = "BR_CATEGORIAS_SEQ", allocationSize = 1)
public class Categoria {

	@Id
	@Column(name="CATE_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BR_CATEGORIAS_SEQ")
	@JsonInclude(value=Include.NON_NULL)
	private Long id;
	
	@Column(name="CATE_CATEGORIA")
	@JsonInclude(value=Include.NON_NULL)
	private String categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
