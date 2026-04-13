/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD09_A02;

/**
 *
 * @author ALUMNO
 */
public class CuentaCorriente {
    final String DNI;
    String NOMBRE;
    int Saldo;
        
    public CuentaCorriente(String dni, String nombre, int saldo) {
        this.DNI = dni;
        this.NOMBRE = nombre;
        this.Saldo = saldo;
    }

        CuentaCorriente(String DNI, String NOMBRE){
            this(DNI, NOMBRE,0);
        }
        
        CuentaCorriente(String DNI, int Saldo){
            this(DNI,"Nada",Saldo);
        }

        public void retirarDinero(int cantidad) {
            Saldo -= cantidad;
        }

        public void ingresarDinero(int cantidad) {
            Saldo += cantidad;
        }

        public int mostrarSaldo() {
            return Saldo;
        }

        public void mostrarInformacion() {
            System.out.println("Informacion:");
            System.out.println(DNI);
            System.out.println(NOMBRE);
            System.out.println(Saldo);
        }
    
    
}

