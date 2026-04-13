/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD09_A04;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Minil
 */
public class Main {
    public static void main(String[] args) {

        BufferedReader lector = null;

        int suma = 0;
        int contador = 0;

        try {
            lector = new BufferedReader(new FileReader("src/main/java/Medina_Romero_Francisco_UD09_A04/numeros.txt"));
            String linea = lector.readLine();

            String[] numeros = linea.split(" ");

            for (int i = 0; i < numeros.length; i++) {

                try {
                    int numero = Integer.parseInt(numeros[i]);
                    suma += numero;
                    contador++;
                } catch (NumberFormatException exc) {
                    System.out.println("Valor no valido: " + numeros[i]);
                }
            }

            int media = suma / contador;

            System.out.println("Suma: " + suma);
            System.out.println("Media: " + media);

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
