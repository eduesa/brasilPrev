package br.com.brasilprev;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.brasilprev.model.PedidoItem;
import br.com.brasilprev.repository.PedidoItemRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class BrasilPrevApplicationTests {

    //Base que irão ser feitas as requests
    final String BASE_PATH = "http://localhost:8080/pedido";
    
    //Injeção do repositório para acesso ao bando de dados
    @Autowired
    PedidoItemRepository pedidoItemRepository;
    
    private RestTemplate restTemplate;    
    
    //converte JSON para Objeto ou o contrário
    private ObjectMapper MAPPER = new ObjectMapper();
	
	/**
	 * Define quem será feito antes da execução do teste
	 * @throws Exception
	 */
    @Before
    public void setUp() throws Exception {     
        
        restTemplate = new RestTemplate();
    }
    
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void listarPedidos() throws IOException{
		
	    String response = restTemplate.getForObject(BASE_PATH + "/findAll", String.class);
	    
	    List<PedidoItem> pedidoItems = MAPPER.readValue(response, MAPPER.getTypeFactory().constructCollectionType(List.class, PedidoItem.class));
	    
	    PedidoItem pedidoItem = restTemplate.getForObject(BASE_PATH + "/" + pedidoItems.get(1), PedidoItem.class);
	    
	  //Avaliando o resultado
	    Assert.assertNotNull(pedidoItem);
	    Assert.assertEquals("Previdência Privada", pedidoItem.getProduto());
	}
}
