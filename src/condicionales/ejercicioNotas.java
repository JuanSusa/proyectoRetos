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
public class ejercicioNotas {
    public static void main(String[] args) {
        double nota=0.0, promedio=0.0, total=0.0;
        Scanner leer = new Scanner (System.in);
        
        for(int i=0;i<=3;i++){
            
            System.out.println("Digite la nota obtenida ");
            nota = leer.nextDouble();
                    
            total = total + nota;
            promedio = total/4;
            
            
        }
        System.out.println("La nota definitiva es " + promedio);
        
        if (promedio <=2.9){
            System.out.println("Reprobaste la asignatura");
            
        }
        else if (promedio <=4.0){
            System.out.println("Pasaste raspando la asignatura");
        }
        else if(promedio >=4.0){
            System.out.println("Aprobaste con buenos resultados");
        }
        else{
            
        }
    }
    
}
