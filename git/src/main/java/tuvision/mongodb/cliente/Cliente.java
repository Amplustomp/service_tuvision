package tuvision.mongodb.cliente;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
 
@Document("tuvision")

public class Cliente {

	  @Id
	  public String id;

	  public String nombre;
	  public String apellido;
	  
	  public Cliente() {}
	  
	  public Cliente(String nombre, String apellido) {
		  this.nombre = nombre;
		  this.apellido = apellido;
	  }
	  
	@Override
	public String toString() {
		return String.format("Cliente[id=%s, nombre='%s', apellido='%s']", id, nombre, apellido);
		
	}
}
