package tuvision.mongodb.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import tuvision.service.cliente.Cliente;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@EnableMongoRepositories("tuvision.mongodb.cliente")

@Service
public class ClienteInsertar{
	  @Autowired
	  private ClienteRepository repository;
	  
	  private static final Logger LOGGER = LogManager.getLogger(ClienteInsertar.class);
	  
	  public Boolean add (Cliente cliente)
	  {
		try {
		repository.save(cliente);
		return true;
		}
		catch(Exception e){
		LOGGER.error("Ha ocurrido un error: " +e);
		return false;
		}
		}
	  }