/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD09_A08;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Minil
 */
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del fichero: ");
        String nombre = sc.nextLine();

        String copia = "copia_de_" + nombre;

        try (
            BufferedReader lector = new BufferedReader(new FileReader(nombre));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(copia))
        ) {
            String linea;

            while ((linea = lector.readLine()) != null) {
                escritor.write(linea);
                escritor.newLine();
            }

            System.out.println("Fichero copiado correctamente en: " + copia);

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
