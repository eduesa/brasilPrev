package br.com.brasilprev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.brasilprev.model.PedidoItem;

public interface PedidoItemRepository extends JpaRepository<PedidoItem, Long>{
	
	public PedidoItem findOneById(Long Id);
	public List<PedidoItem> findTop10ByOrderByIdDesc();

}
