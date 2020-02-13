package cl.tuvision.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "cl.tuvision.cliente.models")
public class MongoDBConfig {

	public String getDatabaseName() {
		return "tuvision";
	}
	
	
	@Bean
	public MongoDbFactory mongoDbFactory() {
		
		MongoDbFactory factory = new SimpleMongoClientDbFactory("mongodb://tuvision_admin:DJ1433#@127.0.0.1:27017/tuvision");
		return factory;
	}
	
	@Bean
	public MongoTemplate mongoTemplate() {
		MongoTemplate template = new MongoTemplate(mongoDbFactory());
		return template;
	}
} 