package tuvision.service.cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import tuvision.mongodb.cliente.ClienteRepository;

@SpringBootApplication
@EnableMongoRepositories (basePackageClasses = ClienteRepository.class)
public class RestServiceApplication {

    public static void main(String[] args) {
    	
        SpringApplication.run(RestServiceApplication.class, args);
    }
}