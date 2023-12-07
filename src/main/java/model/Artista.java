package model;

public class Artista {
	private String nombreArtistico;
	private String rut;
	private String generoMusical;

	public Artista(String nombreArtistico, String rut,String generoMusical) {
		this.nombreArtistico = nombreArtistico;
		this.rut = rut;
		this.generoMusical = generoMusical;
	}

	public String getNombreArtistico() {
		return nombreArtistico;
	}

	public void setNombreArtistico(String nombreArtistico) {
		this.nombreArtistico = nombreArtistico;
	}

	public String getGeneroMusical() {
		return generoMusical;
	}

	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	@Override
	public String toString() {
		return nombreArtistico + "," + rut + "," + generoMusical;
	}
}
