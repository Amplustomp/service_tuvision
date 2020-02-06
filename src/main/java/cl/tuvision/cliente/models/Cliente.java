package cl.tuvision.cliente.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="cliente")
public class Cliente {

	private String nombre;
	private String apellido;
	@Id
	@Indexed
	private String rut;
	private String email;
	private String telefono;
	
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Cliente(String nombre, String apellido, String rut, String email, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.email = email;
		this.telefono = telefono;
	}
}
