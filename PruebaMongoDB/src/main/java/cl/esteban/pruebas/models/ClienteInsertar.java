package cl.esteban.pruebas.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteInsertar {
	@Autowired (required=false)
	private ClienteRepository repository;

	private static final Logger LOGGER = LogManager.getLogger(ClienteInsertar.class);

	public Boolean add(Persona cliente) {
		try {
			repository.save(cliente);
			return true;
		} catch (Exception e) {
			LOGGER.error("Ha ocurrido un error: " + e);
			return false;
		}
	}
}