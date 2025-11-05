/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlversiones_nombreapellido;
import java.util.Scanner;

/**
 *
 * @author venga
 */
public class ControlVersiones_NombreApellido {

    public static void main(String[] args) {
        
        System.out.println("===================================");
        System.out.println("     Cálculo de Promedio Final     ");
        System.out.println("===================================");

        Scanner sc = new Scanner(System.in);
        System.out.println("=== Cálculo de Promedio ===");
        
        System.out.print("Ingrese la primera nota: ");
        double n1 = sc.nextDouble();
        
        System.out.print("Ingrese la segunda nota: ");
        double n2 = sc.nextDouble();
        
        System.out.print("Ingrese la tercera nota: ");
        double n3 = sc.nextDouble();
        
        double promedio = (n1 + n2 + n3) / 3;
        System.out.println("El promedio es: " + promedio);
        
        if (promedio >= 60) {
        System.out.println("Estado: Aprobado");
        } else {
        System.out.println("Estado: Reprobado");
        }
    }
    
}
