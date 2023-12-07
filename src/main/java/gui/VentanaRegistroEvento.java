package gui;

import javax.swing.*;
import java.awt.event.*;

public class VentanaRegistroEvento extends Ventana {

    public VentanaRegistroEvento(String nombre, int largoX, int largoY) {
        super(nombre);

        // Genera componentes gráficos para registrar un evento
        generarEncabezado();
        generarInformacionEvento();
        generarTipoEvento();
        generarListaArtistas();
        generarBotones();
    }

    private void generarEncabezado() {
        generarJLabelEncabezado("Registro de evento", 10, 10, 400, 50);
    }

    private void generarInformacionEvento() {
        // Genera etiquetas y campos de entrada para la información del evento

        generarJLabel(new JLabel("Nombre del evento:"), 10, 70, 150, 25);
        JTextField txtNombreEvento = generarJTextField(170, 70, 200, 25);

        generarJLabel(new JLabel("Fecha:"), 10, 110, 150, 25);
        JFormattedTextField txtFecha = generarJFormattedTextField(generarFormato(1900, 2030), 170, 110, 200, 25);

        generarJLabel(new JLabel("Lugar:"), 10, 150, 150, 25);
        JTextField txtLugar = generarJTextField(170, 150, 200, 25);
    }

    private void generarTipoEvento() {
        JLabel lblTipoEvento = new JLabel("Tipo de evento:");
        lblTipoEvento.setBounds(10, 190, 150, 25);
        this.add(lblTipoEvento);

        JRadioButton rdbtnConcierto = generarJRadioButton("Concierto", 20, 220, 100, 25);
        JRadioButton rdbtnFestival = generarJRadioButton("Festival", 120, 220, 100, 25);
        JRadioButton rdbtnObra = generarJRadioButton("Obra de teatro", 220, 220, 150, 25);

        ButtonGroup grupoTipoEvento = new ButtonGroup();
        grupoTipoEvento.add(rdbtnConcierto);
        grupoTipoEvento.add(rdbtnFestival);
        grupoTipoEvento.add(rdbtnObra);

        // Agrega los radio buttons a la ventana
        this.add(rdbtnConcierto);
        this.add(rdbtnFestival);
        this.add(rdbtnObra);
    }

    private void generarListaArtistas() {
        // Genera lista desplegable para artistas

        JLabel lblArtistas = new JLabel("Artistas participantes:");
        lblArtistas.setBounds(10, 260, 150, 25);
        this.add(lblArtistas);

        JComboBox<String> cmbArtistas = generarListaDesplegable(new String[]{"Artista 1", "Artista 2", "Artista 3"}, 170, 260, 200, 25);
    }

    private void generarBotones() {
        // Genera botones para guardar y cancelar

        JButton btnGuardar = generarBoton("Guardar", 10, 300, 100, 25);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementa la lógica para guardar la información del evento
                // ...
            }
        });

        JButton btnCancelar = generarBoton("Cancelar", 120, 300, 100, 25);
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
