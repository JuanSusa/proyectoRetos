/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EjercicioCalculadora {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int op, num1, num2, total;
        System.out.println("""
                           Menu de opciones 
                            1.Suma 
                            2.Resta 
                            3.Multiplicacion 
                            4.Division 
                            Ingrese el numero de la opcion que desea realizar""");
        op = leer.nextInt();
        
        System.out.println("Ingrese el numero 1");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el numero 2");
        num2 = leer.nextInt();
        
        switch (op) {
            case 1 -> {
                total = num1 + num2;
                System.out.println("La suma entre " + num1 + "y "+ num2 + "es " + total);
            }
            case 2 -> {
                total = num1 - num2;
                System.out.println("La resta entre " + num1 + "y "+ num2 + "es " + total);
            }
            case 3 -> {
                total = num1 * num2;
                System.out.println("La multiplicaion entre " + num1 + "y "+ num2 + "es " + total);
            }
            case 4 -> {
                total = num1 / num2;
                System.out.println("La suma entre " + num1 + "y "+ num2 + "es " + total);
            }
            case 5 -> {                
                double n1=(double) num1;
                double n2=(double) num2;
                double t;             
                t = Math.pow(n1,n2);
                System.out.println("la potencia de " + n1 + "y de " + n2 + "es " + t);
            }
            case 6 -> {                
                double raiz= Math.sqrt(num1);
                double raiz2=Math.sqrt(num2);                
                System.out.println("la raiz cuadrada de " + num1 + "es  " + raiz + "\n y la raiz cuadrada de " + num2 + "es " + raiz2);
            }
            
        }
    }

}
