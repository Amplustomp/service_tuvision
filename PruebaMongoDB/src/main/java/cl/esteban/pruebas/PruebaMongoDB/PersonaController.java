package cl.esteban.pruebas.PruebaMongoDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.esteban.pruebas.models.ClienteRepository;
import cl.esteban.pruebas.models.Persona;

@RestController
public class PersonaController {
	
	@Autowired (required=false)
	private ClienteRepository clienteRepository;
	
	@RequestMapping("/persona")
	public ResponseEntity<Boolean> sample(@RequestBody Persona persona) {
		clienteRepository.addCliente(persona);
		return ResponseEntity.ok().body(true);

	}
}
