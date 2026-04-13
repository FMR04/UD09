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
public class Throw {
    public static Integer numero() throws NumberFormatException {
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce un numero entero: ");
        String texto = teclado.nextLine();

        return Integer.parseInt(texto);
    }
    
    
    public static void main(String[] args) {
        int num = 0;
        boolean correcto = false;

        while (!correcto) {
            try {
                num = numero();
                correcto = true;
            } catch (Exception exc) {
                System.out.println("error, no es valido.");
            }
        }

        System.out.println("Numero:" + num);
    }
}

