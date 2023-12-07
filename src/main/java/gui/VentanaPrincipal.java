package gui;

import controller.EventoMusicalController;
import model.EventoMusical;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends Ventana implements ActionListener {
    private EventoMusicalController controlador;
    private JButton botonVentaEntradas;
    private JButton botonAgregarEvento;
    private JButton botonAgregarArtista;
    private JButton botonAgregarAsistente;
    private JButton botonSalir;

    public VentanaPrincipal(EventoMusicalController controlador) {
        super("Sistema ventas de entradas"); // Use an existing constructor
        super.setSize(500, 500);
        this.controlador = controlador;
        this.generarElementos();
    }

    private void generarElementos() {
        super.generarJLabelEncabezado(null, "Sistema ventas de entradas", 100, 20, 300, 30);
        this.generarBotonVentaEntradas();
        this.generarBotonAgregarEvento();
        this.generarBotonAgregarArtista();
        this.generarBotonAgregarAsistente();
        this.generarBotonSalir();
    }

    private void generarBotonVentaEntradas() {
        JButton btnVentaEntradas = super.generarBoton("Vender Entradas", 100, 70, 300, 50);
        this.botonVentaEntradas = btnVentaEntradas;
        this.add(btnVentaEntradas);
        this.botonVentaEntradas.addActionListener(this);
    }

    private void generarBotonAgregarEvento() {
        JButton btnAgregarEvento = super.generarBoton("Agregar Evento", 100, 130, 300, 50);
        this.botonAgregarEvento = btnAgregarEvento;
        this.add(btnAgregarEvento);
        this.botonAgregarEvento.addActionListener(this);
    }

    private void generarBotonAgregarArtista() {
        JButton btnAgregarArtista = super.generarBoton("Agregar Artista", 100, 190, 300, 50);
        this.botonAgregarArtista = btnAgregarArtista;
        this.add(btnAgregarArtista);
        this.botonAgregarArtista.addActionListener(this);
    }

    private void generarBotonAgregarAsistente() {
        JButton btnAgregarAsistente = super.generarBoton("Agregar Asistente", 100, 250, 300, 50);
        this.botonAgregarAsistente = btnAgregarAsistente;
        this.add(btnAgregarAsistente);
        this.botonAgregarAsistente.addActionListener(this);
    }

    private void generarBotonSalir() {
        JButton btnSalir = super.generarBoton("Salir", 100, 370, 300, 50);
        this.botonSalir = btnSalir;
        this.add(btnSalir);
        this.botonSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonVentaEntradas) {
            // Implementa la lógica para vender entradas
        }

        if (e.getSource() == this.botonAgregarEvento) {
            // Implementa la lógica para agregar un evento
        }

        if (e.getSource() == this.botonAgregarArtista) {
            // Implementa la lógica para agregar un artista
        }

        if (e.getSource() == this.botonAgregarAsistente) {
            // Implementa la lógica para agregar un asistente
        }

        if (e.getSource() == this.botonSalir) {
            // Cierra la ventana y guarda los datos
            controlador.guardarDatos();
            System.exit(0);
        }
    }
}
