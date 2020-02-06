package cl.tuvision.cliente.models;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import cl.tuvision.cliente.service.ClienteService;
@EnableMongoRepositories(basePackages = "cl.tuvision.cliente.models")


public class ClienteController {
	
	public static Boolean add(Cliente persona) {
		
		
		final Logger LOGGER = LogManager.getLogger(ClienteService.class);

		
		//Se crea la conexión a la base de datos MongoDB
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(MongoDBConfig.class);
		ctx.refresh();
		//Se inicializa el objeto
		MongoTemplate mongoTemplate = ctx.getBean(MongoTemplate.class);
		
		try {
		
		//Se asignan los datos del Objeto		
		Cliente novato = new Cliente(persona.getNombre(), persona.getApellido(),persona.getRut(),persona.getEmail(),persona.getTelefono());
		
		mongoTemplate.save(novato);
		
		/*  Consulta para validar la info 
		
		Query query = new Query();
		query.addCriteria(Criteria.where("apellido").is("Cortés"));
		List<Cliente> list = mongoTemplate.find(query, Cliente.class, "cliente");
		list.forEach(std -> System.out.println(std.getNombre() + " - " + std.getApellido()));
		
		*/
		
		ctx.registerShutdownHook();
		ctx.close();		
		
		return true;
		}
		catch(Exception e){
			
			LOGGER.info("Ha Ocurrido un Problema: " + e);
			ctx.registerShutdownHook();
			ctx.close();	

			return false;
			
		}
		}
	}

