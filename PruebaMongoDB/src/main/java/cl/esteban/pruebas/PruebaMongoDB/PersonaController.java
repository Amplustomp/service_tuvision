package cl.esteban.pruebas.PruebaMongoDB;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
		
		final Logger LOGGER = LogManager.getLogger(PersonaController.class);
		
		LOGGER.info("Persona - Nombre: " + persona.getNombre());
		LOGGER.info("Persona - Apellido: " + persona.getApellido());
		
		clienteRepository.addCliente(persona);
		
		return ResponseEntity.ok().body(true);

	}
}
