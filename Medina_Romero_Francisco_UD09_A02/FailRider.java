/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD09_A02;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Minil
 */
public class FailRider {
     public static void main(String[] args) {
        FileReader lector = null;

        try {
lector = new FileReader("src/main/java/Medina_Romero_Francisco_UD09_A02/Main.java");
            int caracter;

            while ((caracter = lector.read()) != -1) {
                System.out.print((char) caracter);
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
