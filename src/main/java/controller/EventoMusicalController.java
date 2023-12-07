package controller;

import data.GestorDatos;
import model.Artista;
import model.EventoMusical;

import java.util.Date;
import java.util.List;

public class EventoMusicalController {

    public static EventoMusical cargaMasivaDatos(EventoMusical eventoMusical){
        GestorDatos.leerArchivoEventos(eventoMusical, "eventos.txt");
        GestorDatos.leerArchivoArtistas(eventoMusical, "artistas.txt");
        GestorDatos.leerArchivoAsistentes(eventoMusical, "asistentes.txt");
        return eventoMusical;
    }

    public static EventoMusical agregarEvento(EventoMusical eventoMusical, String nombre, Date fecha, String lugar){
        EventoMusical nuevoEvento = new EventoMusical(nombre, fecha, lugar);
        eventoMusical.getEventos().add(nuevoEvento);
        System.out.println("Evento registrado correctamente.");
        return nuevoEvento;
    }

    public static Artista agregarArtista(EventoMusical eventoMusical, String nombreArtistico,String rut, String generoMusical){
        return eventoMusical.agregarArtista(nombreArtistico, rut, generoMusical);
    }

    public static void almacenarDatos(EventoMusical eventoMusical){
        GestorDatos.registrarDatos(eventoMusical.getArtistas(), "artistas.txt");
        GestorDatos.registrarDatos(eventoMusical.getAsistentes(), "asistentes.txt");
        GestorDatos.registrarDatos(eventoMusical.getEventos(), "eventos.txt");
    }
}
