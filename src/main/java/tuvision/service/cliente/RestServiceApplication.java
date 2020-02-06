package tuvision.service.cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"tuvision.mongodb.cliente"})

public class RestServiceApplication {

    public static void main(String[] args) {
    	
        SpringApplication.run(RestServiceApplication.class, args);
    }
}