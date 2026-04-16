/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD09_A07;
import java.io.*;
/**
 *
 * @author ALUMNO
 */
public class Main {
    public static void main(String[] args){
        try(BufferedWriter out = new BufferedWriter(new FileWriter("Archivo.txt"))) {
                out.write("En un lugar de La Mancha");
                out.write("de cuyo nombre no quiero acordarme");
                out.flush();
            }catch (IOException exc){
                    System.out.println("Error al esbricir");
            } finally {
            
        }
    }
}
