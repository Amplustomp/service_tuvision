package tuvision.service.cliente;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tuvision.mongodb.cliente.ClienteInsertar;

@RestController
public class ClienteController {
	
	@Autowired
    private ClienteInsertar service;
	

	
	@RequestMapping("/crear")
	public ResponseEntity<Boolean> create(@RequestBody Cliente cliente) throws URISyntaxException {
		
		//Logica estúpida
		
		Boolean respuesta;
		
	    respuesta = service.add(cliente);
	    return ResponseEntity.ok()
	          .body(respuesta);
	    
	}
    
    
	

}


