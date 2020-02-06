package cl.tuvision.cliente.models;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface ClienteRepository extends MongoRepository<Cliente, String> {
 
	public Cliente findByNombre(String nombre);
	public List<Cliente> findByApellido(String apellido);

}