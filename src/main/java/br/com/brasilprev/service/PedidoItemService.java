package br.com.brasilprev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.brasilprev.model.PedidoItem;
import br.com.brasilprev.repository.PedidoItemRepository;

@Service
public class PedidoItemService {

	@Autowired
	private PedidoItemRepository repository;

	public PedidoItem obter(Long id) {
		
		PedidoItem pedidoItem = this.repository.findOneById(id);
		
		return pedidoItem;
		
	}
	
	public List<PedidoItem> listar(){
		return this.repository.findTop10ByOrderByIdDesc();
	}
	
}
