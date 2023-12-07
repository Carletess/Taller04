package data;

import model.*;

import java.io.*;

public class GestorDatos {
    public static EventoMusical leerArchivoEventos(EventoMusical eventoMusical, String direccionArchivo) {
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            // Lee cada línea del archivo hasta que la línea sea nula
            while ((textoArchivo = br.readLine()) != null) {
                System.out.println("Encontré el archivo " + direccionArchivo);
                String[] data = textoArchivo.split(",");
                // Crea un nuevo evento musical y añádelo al sistema musical
                eventoMusical.getAgenda().agregarEvento(new EventoMusical(data[0], /* Parsea la fecha y la hora según tu implementación */, data[3], eventoMusical.getAgenda()));
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Eventos.txt no disponible, favor contactar con administrador");
        }
        return eventoMusical;
    }

    public static EventoMusical leerArchivoArtistas(EventoMusical eventoMusical, String direccionArchivo) {
        String textoArchivo = "";

        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            // Lee cada línea del archivo hasta que la línea sea nula
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(",");
                // Crea un nuevo artista y añádelo al sistema musical
                eventoMusical.agregarArtista(data[0], data[1], data[3]);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Artistas.txt no disponible, favor contactar con administrador");
        }
        return eventoMusical;
    }

    public static EventoMusical leerArchivoAsistentes(EventoMusical eventoMusical, String direccionArchivo) {
        String textoArchivo = "";

        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            // Lee cada línea del archivo hasta que la línea sea nula
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(",");
                // Crea un nuevo asistente y añádelo al sistema musical
                eventoMusical.agregarAsistente(new Asistente(data[0], data[1], Integer.parseInt(data[2]), data[3], data[4]));
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Asistentes.txt no disponible, favor contactar con administrador");
        }
        return eventoMusical;
    }

    // Otros métodos de la clase
}
