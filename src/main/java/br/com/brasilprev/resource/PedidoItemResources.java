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

import br.com.brasilprev.model.PedidoItem;
import br.com.brasilprev.service.PedidoItemService;

@RestController
@RequestMapping("/pedidos")
public class PedidoItemResources {

	@Autowired
	PedidoItemService service;
	
	@CrossOrigin
	@GetMapping(value = "/{id}",  produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<PedidoItem> obter(@PathVariable("id") Long id) {

		PedidoItem pedidoItem = this.service.obter(id);

		return ResponseEntity.ok(pedidoItem);

	}

	@CrossOrigin
	@GetMapping	
	public ResponseEntity<List<PedidoItem>> listarPedidoItens() {
		
		List<PedidoItem> listaPedidoItem = this.service.listar();
		
		return ResponseEntity.ok(listaPedidoItem);
	}
}
