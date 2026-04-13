/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD09_A01;
import java.util.Scanner;
/**
 *
 * @author Fran
 */
public class Recu {
    public static Integer numero() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        String texto = teclado.nextLine();
     
        try {
            return Integer.parseInt(texto);
        } catch (Exception exc) {
            System.out.println("error, no es valido.");
            return numero();
        }
    }

    public static void main(String[] args) {
        int n = numero();
        System.out.println("numero:" + n);
    }
}
