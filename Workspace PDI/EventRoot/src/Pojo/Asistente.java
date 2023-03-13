package Pojo;

public class Asistente {
	
	private int id;
	private String nombre;
	private int telefono;
	private String email;
	private int password;
	private Evento evento;
	
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public String getEmail() {
		return email;
	}
	public int getPassword() {
		return password;
	}
	
	public Evento getEvento() {
		return evento;
	}
	
	//TODO Introducir metodo para los permisos

}
