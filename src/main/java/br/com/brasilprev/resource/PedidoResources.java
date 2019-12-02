package br.com.brasilprev.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.brasilprev.model.Pedido;
import br.com.brasilprev.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoResources {

	@Autowired
	PedidoService service;
	
	@CrossOrigin
	@GetMapping(value = "/{id}",  produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Pedido> obter(@PathVariable("id") Long id) {

		Pedido pedido = this.service.obter(id);

		return ResponseEntity.ok(pedido);

	}

	@CrossOrigin
	@GetMapping	
	public ResponseEntity<List<Pedido>> listarPedidos() {
		
		List<Pedido> listaPedido = this.service.listar();
		
		return ResponseEntity.ok(listaPedido);
	}
}
