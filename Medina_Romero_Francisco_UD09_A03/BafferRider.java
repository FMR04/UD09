/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD09_A03;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Minil
 */
public class BafferRider {
        public static void main(String[] args) {
        BufferedReader lector = null;

        try {
            lector = new BufferedReader(new FileReader("src/main/java/Medina_Romero_Francisco_UD09_A04/Main.java")
            );
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException exc) {
            System.out.println("Error al leer el archivo.");
        } finally {
            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (IOException exc) {
                System.out.println("Error al cerrar el archivo.");
            }
        }
    }
}
