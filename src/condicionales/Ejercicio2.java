/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int num;
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        
        if(num<0){
            System.out.println("El numero es negativo");
        }
        else if(num==0){
            System.out.println("El numero es neutro");
        }
        else if(num>0){
            System.out.println("El numero es positivo");
        }
        else{
            System.out.println("Dato incorrecto");
        }
    }
    
}
