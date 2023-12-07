package model;

import java.util.List;
import java.util.ArrayList;

public class Asistente {

	private String nombre;
	private String apellido;
	private int rut;
	private String email;
	private String telefono;
	private List<Entrada> entradas;

	public Asistente(String nombre, String apellido, int rut, String email, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.email = email;
		this.telefono = telefono;
		this.entradas = new ArrayList<>();
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

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
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

	public List<Entrada> getEntradas() {
		return entradas;
	}

	public void setEntradas(List<Entrada> entradas) {
		this.entradas = entradas;
	}

	@Override
	public String toString() {
		return "Asistente{" +
				"nombre='" + nombre + '\'' +
				", apellido='" + apellido + '\'' +
				", rut=" + rut +
				", email='" + email + '\'' +
				", telefono='" + telefono + '\'' +
				", entradas=" + entradas +
				'}';
	}
}
