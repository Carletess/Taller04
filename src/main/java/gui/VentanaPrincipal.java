package gui;

import controller.EventoMusicalController;
import model.*;

import javax.swing.*;
import java.awt.event.*;

public class VentanaPrincipal extends Ventana {

    private JLabel textoMenu;
    private JButton botonAgregarEvento;
    private JButton botonAgregarArtista;
    private JButton botonRegistrarAsistente;
    private JButton botonVentaEntradas;
    private JButton botonSalir;
    protected EventoMusical eventoMusical;

    public VentanaPrincipal(EventoMusical eventoMusical) {
        super("Menu Sistema Musical", 500, 520);
        this.eventoMusical = eventoMusical;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarMensajeMenu();
        generarBotonAgregarEvento();
        generarBotonAgregarArtista();
        generarBotonRegistrarAsistente();
        generarBotonVentaEntradas();
        generarBotonSalir();
    }

    private void generarMensajeMenu() {
        String textoBienvenida = "Sistema de Eventos Musicales";
        super.generarJLabelEncabezado(this.textoMenu, textoBienvenida, 20, 30, 500, 30);
    }

    private void generarBotonAgregarEvento() {
        String textoBoton = "Crear Evento";
        this.botonAgregarEvento = super.generarBoton(textoBoton, 175, 100, 150, 40);
        this.add(this.botonAgregarEvento);
        this.botonAgregarEvento.addActionListener(this);
    }

    private void generarBotonAgregarArtista() {
        String textoBoton = "Registrar Artista";
        this.botonAgregarArtista = super.generarBoton(textoBoton, 175, 180, 150, 40);
        this.add(this.botonAgregarArtista);
        this.botonAgregarArtista.addActionListener(this);
    }

    private void generarBotonRegistrarAsistente() {
        String textoBoton = "Registrar Asistente";
        this.botonRegistrarAsistente = super.generarBoton(textoBoton, 175, 260, 150, 40);
        this.add(this.botonRegistrarAsistente);
        this.botonRegistrarAsistente.addActionListener(this);
    }

    private void generarBotonVentaEntradas() {
        String textoBoton = "Venta de Entradas";
        this.botonVentaEntradas = super.generarBoton(textoBoton, 175, 340, 150, 40);
        this.add(this.botonVentaEntradas);
        this.botonVentaEntradas.addActionListener(this);
    }

    private void generarBotonSalir() {
        String textoBoton = "Salir";
        this.botonSalir = super.generarBoton(textoBoton, 175, 420, 150, 40);
        this.add(this.botonSalir);
        this.botonSalir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonAgregarEvento) {
            VentanaRegistroEvento ventanaAgregarEvento = new VentanaRegistroEvento("a", 200, 300);
            this.dispose();
        }
    }
}
