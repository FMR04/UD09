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
public class Main {
   public static Integer numero() {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        boolean correcto = false;

        while (!correcto) {
            System.out.print("introduce un numero entero:");
            String texto = teclado.nextLine();
            try {
                num = Integer.parseInt(texto);
                correcto = true;
            } catch (Exception exc) {
                System.out.println("Error; no es valido.");
            }
        }
     return num;
    }

    public static void main(String[] args) {
        int n = numero();
        System.out.println("Numero:" + n);
    } 
}
