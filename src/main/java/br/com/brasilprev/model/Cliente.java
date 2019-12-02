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
@Table(name = "BR_CLIENTES")
@SequenceGenerator(name = "BR_CLIENTES_SEQ", sequenceName = "BR_CLIENTES_SEQ", allocationSize = 1)
public class Cliente {
	
	@Id
	@Column(name="CLIE_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BR_CLIENTES_SEQ")
	@JsonInclude(value=Include.NON_NULL)
	private Long id;
	
	@Column(name="CLIE_NOME")
	@JsonInclude(value=Include.NON_NULL)
	private String nome;

	@Column(name="CLIE_EMAIL")
	@JsonInclude(value=Include.NON_NULL)	
	private String email;

	@Column(name="CLIE_SENHA")
	@JsonInclude(value=Include.NON_NULL)
	private String senha;

	@Column(name="CLIE_RUA")
	@JsonInclude(value=Include.NON_NULL)
	private String rua;
	
	@Column(name="CLIE_CIDADE")
	@JsonInclude(value=Include.NON_NULL)
	private String cidade;
	
	@Column(name="CLIE_BAIRRO")
	@JsonInclude(value=Include.NON_NULL)
	private String bairro;
	
	@Column(name="CLIE_CEP")
	@JsonInclude(value=Include.NON_NULL)
	private Long cep;
	
	@Column(name="CLIE_ESTADO")
	@JsonInclude(value=Include.NON_NULL)
	private String estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Long getCep() {
		return cep;
	}

	public void setCep(Long cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
