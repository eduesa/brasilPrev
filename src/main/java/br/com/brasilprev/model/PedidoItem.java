package br.com.brasilprev.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "BR_PEDIDO_ITEMS")
@SequenceGenerator(name = "BR_PEDIDO_ITEMS_SEQ", sequenceName = "BR_PEDIDO_ITEMS_SEQ", allocationSize = 1)
public class PedidoItem {
	
	@Id
	@Column(name="PEIT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BR_PEDIDO_ITEMS_SEQ")
	@JsonInclude(value=Include.NON_NULL)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "PEIT_PEDI_ID")
	@JsonInclude(value=Include.NON_NULL)
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "PEIT_PROD_ID")
	@JsonInclude(value=Include.NON_NULL)
	private Produto idProduto;
	
	/***
	 * AVALIAR: necessidade desde campo, pois já existe o vinculo com a entidade Produto
	 */
	@Column(name="PEIT_PRODUTO")
	@JsonInclude(value=Include.NON_NULL)
	private String produto;
	
	@Column(name="PEIT_QUANTIDADE")
	@JsonInclude(value=Include.NON_NULL)
	private int quantidade;
	
	@Column(name="PEIT_VALOR")
	@JsonInclude(value=Include.NON_NULL)
	private BigDecimal valor;
	
	@Column(name="PEIT_SUBTOTAL")
	@JsonInclude(value=Include.NON_NULL)
	private BigDecimal subTotal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Produto idProduto) {
		this.idProduto = idProduto;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}
}
