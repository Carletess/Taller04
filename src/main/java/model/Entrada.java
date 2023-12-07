package model;

import java.util.Random;
public class Entrada {

	private int numero;
	private TipoEntrada tipo;
	private double precio;
	private String estado;
	private Asistente asistente;

	public Entrada(int numero, TipoEntrada tipo, double precio, String estado, Asistente asistente) {
		this.numero = numero;
		this.tipo = tipo;
		this.precio = precio;
		this.estado = estado;
		this.asistente = asistente;
	}

	private int generarNumeroUnico() {
		Random rand = new Random();
		return rand.nextInt(1000000); // Puedes ajustar el rango según tus necesidades
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public TipoEntrada getTipo() {
		return tipo;
	}

	public void setTipo(TipoEntrada tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Asistente getAsistente() {
		return asistente;
	}

	public void setAsistente(Asistente asistente) {
		this.asistente = asistente;
	}

	@Override
	public String toString() {
		return "Entrada{" +
				"numero=" + numero +
				", tipo=" + tipo +
				", precio=" + precio +
				", estado='" + estado + '\'' +
				", asistente=" + asistente +
				'}';
	}
}
