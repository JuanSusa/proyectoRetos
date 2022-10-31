/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int edad;
        System.out.println("Ingrese su edad");
        edad = leer.nextInt();
        
        if(edad>=18){
            //lo que se ejecuta si la condicion se cumple
            System.out.println("Bienvenido");
        }
        else{
            //lo que se ejecuta si la condicion no se cumple
            System.out.println("No puede ingresar");
        }
        leer.close();
        
    }
    
}
