package cl.esteban.pruebas.models;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface ClienteRepository extends MongoRepository<Persona, String> {
  public Persona findByNombre(String nombre);
  public List<Persona> findByApellido(String apellido);
  public Persona addCliente(Persona Persona);

}