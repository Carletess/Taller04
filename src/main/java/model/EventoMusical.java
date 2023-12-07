package model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

import utils.*;

public class EventoMusical {
	private Agenda agenda;

	private String nombre;
	private Date fecha;
	private String lugar;
	private ArrayList<Artista> artistas;
	private ArrayList<Entrada> entradas;
	private ArrayList<Asistente> asistentes;

	public EventoMusical(String nombre, Date fecha, String lugar) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.lugar = lugar;
		this.artistas = new ArrayList<>();
		this.entradas = new ArrayList<>();
		this.asistentes = new ArrayList<>();
	}

	// Getter and Setter methods

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public EventoMusical(String nombre, Date fecha, LocalTime hora, String lugar, Agenda agenda) {
		// ...
		this.agenda = agenda;
	}

	public ArrayList<Artista> getArtistas() {
		return artistas;
	}

	public void setArtistas(ArrayList<Artista> artistas) {
		this.artistas = artistas;
	}

	public ArrayList<Entrada> getEntradas() {
		return entradas;
	}

	public void setEntradas(ArrayList<Entrada> entradas) {
		this.entradas = entradas;
	}

	public ArrayList<Asistente> getAsistentes() {
		return asistentes;
	}

	public void setAsistentes(ArrayList<Asistente> asistentes) {
		this.asistentes = asistentes;
	}

	public boolean agregarArtista(String nombreArtistico, String rut, String generoMusical) {
		// Check if the artist with the given ID is already in the list
		for (Artista existingArtista : this.artistas) {
			if (existingArtista.getRut().equals(rut)) {
				System.out.println("El artista con RUT " + rut + " ya está registrado.");
				return false;
			}
		}

		// If not, create a new artist and add them to the list
		Artista artista = new Artista(nombreArtistico, rut, generoMusical);
		this.artistas.add(artista);
		System.out.println("Artista registrado correctamente.");
		return true;
	}
}
