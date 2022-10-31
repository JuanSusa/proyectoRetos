/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secuenciales;

import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        float edad,peso,dosis;
        System.out.println("Ingrese el peso del bebe");
        edad = leer.nextFloat();
        edad = edad*10;
        System.out.println("Ingrese la edad del bebe");
        peso = leer.nextFloat();
        peso = peso+10;
        
        dosis = peso/edad*8;
        System.out.println("la dosis a aplicar es de " + dosis + " milimetos cubicos");
        leer.close();
    }
    
}
