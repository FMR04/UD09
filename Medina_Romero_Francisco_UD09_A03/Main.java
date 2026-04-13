/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD09_A03;
import Medina_Romero_Francisco_UD09_A02.*;
import java.util.Scanner;

/**
 *
 * @author ALUMNO
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CuentaCorriente Cuenta = new CuentaCorriente("03494227K", "Paco", 0);

        // Retiro
        System.out.println("¿Cuanto dinero deseas retirar?");
        int retiro = teclado.nextInt();
        Cuenta.retirarDinero(retiro);
        System.out.println("Total: " + Cuenta.mostrarSaldo());

        // Ingreso
        System.out.println("¿Cuanto dinero deseas ingresar?");
        int ingreso = teclado.nextInt();
        Cuenta.ingresarDinero(ingreso);

        // Información
        System.out.println("Total: " + Cuenta.mostrarSaldo());
        Cuenta.mostrarInformacion();
    }
}

