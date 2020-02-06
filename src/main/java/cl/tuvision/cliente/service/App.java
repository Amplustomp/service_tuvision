package cl.tuvision.cliente.service;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import cl.tuvision.configuracion.spring;

@SpringBootApplication
@EnableConfigurationProperties(spring.class)
public class App 
{
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
}
