package br.com.brasilprev.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@Entity
@Table(name = "BR_PEDIDOS")
@SequenceGenerator(name = "BR_PEDIDOS_SEQ", sequenceName = "BR_PEDIDOS_SEQ", allocationSize = 1)
public class Pedido {

	@Id
	@Column(name="PEDI_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BR_PEDIDOS_SEQ")
	@JsonInclude(value=Include.NON_NULL)
	private Long id;
	
	@Column(name="PEDI_DATA", nullable=false)
	@JsonInclude(value=Include.NON_NULL)
	@JsonFormat(pattern="dd/MM/yyyy")	
	private Date data;

	@ManyToOne
	@JoinColumn(name = "PEDI_CLIE_ID")
	@JsonInclude(value=Include.NON_NULL)
	private Cliente cliente;
	
	@Column(name="PEDI_STATUS", nullable=false)
	private int status;
	
	@Column(name="PEDI_SESSAO")
	@JsonInclude(value=Include.NON_NULL)
	private String sessao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getSessao() {
		return sessao;
	}

	public void setSessao(String sessao) {
		this.sessao = sessao;
	}
	
}
