package tuvision.mongodb.cliente;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import tuvision.service.cliente.Cliente;

@Service
public interface ClienteRepository extends MongoRepository<Cliente, String> {
  public Cliente findByNombre(String nombre);
  public List<Cliente> findByApellido(String apellido);
  public Cliente addCliente(String Cliente);

}