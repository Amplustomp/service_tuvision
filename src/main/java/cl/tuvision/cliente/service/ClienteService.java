package cl.tuvision.cliente.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cl.tuvision.cliente.controller.ClienteController;
import cl.tuvision.cliente.models.Cliente;

@RestController
@RequestMapping(value = "/tuvision/cliente")
public class ClienteService {


	@RequestMapping(value = "/crear", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Boolean> sample(@RequestBody Cliente persona) {
	
		
		final Logger LOGGER = LogManager.getLogger(ClienteService.class);

		
		LOGGER.info("Persona - Nombre: " + persona.getNombre());
		LOGGER.info("Persona - Apellido: " + persona.getApellido());
		LOGGER.info("Persona - Rut: " + persona.getRut());
		LOGGER.info("Persona - Mail: " + persona.getEmail());
		LOGGER.info("Persona - Telefono: " + persona.getTelefono());
		
		Boolean respuesta = ClienteController.add(persona);
		
		LOGGER.info("It Work !!!");
		
		return ResponseEntity.ok().body(respuesta);

	}
}
