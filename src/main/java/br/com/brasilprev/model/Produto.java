package br.com.brasilprev.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "BR_PRODUTOS")
@SequenceGenerator(name = "BR_PRODUTOS_SEQ", sequenceName = "BR_PRODUTOS_SEQ", allocationSize = 1)
public class Produto {
	
	@Id
	@Column(name="PROD_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BR_PRODUTOS_SEQ")
	@JsonInclude(value=Include.NON_NULL)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "PROD_CATE_ID")
	@JsonInclude(value=Include.NON_NULL)
	private Categoria categoria;
	
	@Column(name="PROD_PRODUTO")
	@JsonInclude(value=Include.NON_NULL)
	private String produto;

	@Column(name="PROD_PRECO")
	@JsonInclude(value=Include.NON_NULL)
	private BigDecimal preco;
	
	@Column(name="PROD_QUANTIDADE")
	@JsonInclude(value=Include.NON_NULL)
	private int quantidade;
	
	@Column(name="PROD_DESCRICAO")
	@JsonInclude(value=Include.NON_NULL)
	private String descricao;
	
	@Lob
	@Column(name = "PROD_FOTO")
	@JsonInclude(value=Include.NON_NULL)
	private byte[] foto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
}
