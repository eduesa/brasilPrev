package br.com.brasilprev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brasilprev.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
	
	public Pedido findOneById(Long Id);
	public List<Pedido> findTop10ByOrderByIdDesc();

}
