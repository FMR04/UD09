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
        try(BufferedWriter out = new BufferedWriter(new FileWriter("quijote.txt"))) {
            String cad = "En un lugar de La Mancha,";
            for (int i = 0; i < cad.length(); i++) {
                out.write(cad.charAt(i));
            }
            cad = "de cuyo nombre no quiero acordarme."; 
            out.newLine();
            out.write(cad);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
