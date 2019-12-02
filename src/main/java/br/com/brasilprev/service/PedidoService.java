package br.com.brasilprev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.brasilprev.model.Pedido;
import br.com.brasilprev.repository.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repository;

	public Pedido obter(Long id) {
		
		Pedido pedido = this.repository.findOneById(id);
		
		return pedido;
		
	}
	
	public List<Pedido> listar(){
		return this.repository.findTop10ByOrderByIdDesc();
	}
	
}
