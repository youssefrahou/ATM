/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_grupal;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Youssef
 */
public class Variables {

    static String cliente = "";
    static Color principal = Color.cyan;
    static Color secundario = Color.cyan;
    static Color terciario = Color.cyan;
    static String nombre = "";

    public static void getVariables() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(System.getProperty("user.dir") + "/src/atm_grupal/cliente.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.replaceAll("cliente: ", "");
                System.out.println(linea);
                cliente = linea;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
                cargarVariables(cliente);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void cargarVariables(String cliente) {

        switch (cliente) {
            case "bbva":
                principal = Color.cyan;
                secundario = Color.cyan;
                terciario = Color.cyan;
                nombre = "BBVA";
                break;
            case "santander":
                principal = Color.white;
                secundario = Color.white;
                terciario = Color.white;
                nombre = "Santander";
                break;
            case "ing":
                principal = Color.orange;
                secundario = Color.orange;
                terciario = Color.orange;
                nombre = "ING";
                break;
            default:
                principal = new java.awt.Color(255, 204, 204);
                secundario = new java.awt.Color(255, 204, 204);
                terciario = new java.awt.Color(255, 204, 204);
                nombre = "PeponaBank";
                break;
        }

    }
}
