package model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<EventoMusical> eventos;

    public Agenda() {
        this.eventos = new ArrayList<>();
    }

    public List<EventoMusical> getEventos() {
        return eventos;
    }

    public void agregarEvento(EventoMusical evento) {
        this.eventos.add(evento);
    }

    // Otros métodos que necesites para gestionar la lista de eventos
}

