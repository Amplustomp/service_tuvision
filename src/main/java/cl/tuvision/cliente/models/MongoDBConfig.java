package cl.tuvision.cliente.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import cl.tuvision.cliente.service.ClienteService;
import cl.tuvision.configuracion.spring;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@Configuration
@EnableMongoRepositories(basePackages = "cl.tuvision.cliente.models")
@EnableConfigurationProperties(spring.class)
public class MongoDBConfig {

	public String getDatabaseName() {
		return "tuvision";
	}
	
	
	spring holi = new spring();
	
	@Bean
	public MongoDbFactory mongoDbFactory() {

		Logger LOGGER = LogManager.getLogger(ClienteService.class);
		LOGGER.info("CESAR: " + holi.getUri());
		
		MongoDbFactory factory = new SimpleMongoClientDbFactory("mongodb://tuvision_admin:DJ1433#@127.0.0.1:27017/tuvision");
		return factory;
	}
	
	@Bean
	public MongoTemplate mongoTemplate() {
		MongoTemplate template = new MongoTemplate(mongoDbFactory());
		return template;
	}
} 