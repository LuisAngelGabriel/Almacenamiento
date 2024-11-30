package com.example.almacenarinventario;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Almacenar {

    public static void almacenarDatos(String id, String tipoActivo, String marca, String modelo,
                                      String serial, String responsable) {

        String datos = id + ";" +
                tipoActivo + ";" +
                marca + ";" +
                modelo + ";" +
                serial + ";" +
                responsable + "\n";

        String rutaArchivo = "inventario.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            writer.append(datos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
