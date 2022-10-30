/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estaticas;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Reto1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int evaluarN;
        double total=0.0,promedio=0.0;
                        
        System.out.println("Ingrese la cantidad de notas a evaluar ");
        evaluarN = leer.nextInt();
        System.out.println("las cantidad de notas a evaluar son " + evaluarN);
        
        double []notaEvaluar = new double [evaluarN];
        
        for (int i=0;i<notaEvaluar.length;i++){
            System.out.println("Ingrese el valor de la nota " + i);
            notaEvaluar[i] = leer.nextDouble();
            total = total + (notaEvaluar[i]);          
            promedio = total/(evaluarN);
        }
        System.out.println("El promedio total de las notas evaluadas es de " + promedio);
        if (promedio < 3.0){
            System.out.println("Reprobaste la asignatura");
        }
        else if (promedio<=3.9){
            System.out.println("Pasate raspando la asignatura");
        }
        else if (promedio >=4.0){
            System.out.println("Aprobaste con buenos resultados");
        }
       
        else{
            
        }
        leer.close();       
    }
    
}
