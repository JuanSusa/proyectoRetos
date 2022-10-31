/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secuenciales;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Reto5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String nombre, apellido, nombreCompleto;
        
        System.out.println("Digite su nombre");
        nombre = leer.next();
        
        System.out.println("Digite su apellido ");
        apellido = leer.next();
        
        int length = nombre.length();
        System.out.println("La longitud de su nombre es: " + length);
        
        int length1 = apellido.length();
        System.out.println("La longitud de su apellido es: " + length1);
        
        System.out.println("Nombre en MAYUSCULA: " + nombre.toUpperCase());
        
        System.out.println("Apellido en MINISCULA: " + apellido.toLowerCase());
        
        nombreCompleto = nombre +" "+ apellido;
        System.out.println(nombreCompleto );
        
        String subnombre = nombre.substring(0,2);
        System.out.println(subnombre);
        
        System.out.println(subnombre + apellido);
        
        
    }
    
}
