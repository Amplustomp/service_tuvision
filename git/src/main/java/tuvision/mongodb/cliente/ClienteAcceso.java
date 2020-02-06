package tuvision.mongodb.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableMongoRepositories("tuvision.mongodb")

@SpringBootApplication
public class ClienteAcceso implements CommandLineRunner {

  @Autowired
  private ClienteRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(ClienteAcceso.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

	// F en el Chat boys
    repository.deleteAll();

    // Agregamos nueva gente
    repository.save(new Cliente("Sergio", "Cortés"));
    repository.save(new Cliente("Eduardo", "Álvarez"));
    repository.save(new Cliente("Valeska", "Rebolledo"));
    repository.save(new Cliente("Roxana", "Torres"));
    repository.save(new Cliente("Alexander", "Álvarez"));
    
    // Pa' toda la people
    System.out.println("Clientes encontrados con findAll():");
    System.out.println("-------------------------------");
    for (Cliente cliente : repository.findAll()) {
      System.out.println(cliente);
    }
    System.out.println();

    // Pa' buscar un solo cliente
    System.out.println("Clientes encontrados con findByNombre('Sergio'):");
    System.out.println("--------------------------------");
    System.out.println(repository.findByNombre("Sergio"));

    System.out.println("Clientes encontrados con findByApellido('Álvarez'):");
    System.out.println("--------------------------------");
    for (Cliente cliente : repository.findByApellido("Álvarez")) {
      System.out.println(cliente);
    }

  }

}