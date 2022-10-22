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
public class ejercicioGenero {
    public static void main(String[] args) {
        
        int hombre=0, mujer=0, genero;
        Scanner leer = new Scanner (System.in);
        
        for (int i=0; i<=9; i++){
            
            System.out.println("ingrese 1 si es hombre o 2 si es mujer");
            genero = leer.nextInt();
            
            if (genero == 1){
                
                hombre = hombre+1;
                
            }
            else if(genero == 2){
                
                mujer = mujer + 1;
            }
            else {
                System.out.println("Datos incorrectos");
            }
        }
        
        System.out.println("En el grupo hay una cantidad de " + hombre + " hombres " + " y una cantidad de " + mujer + " mujeres " );
    }
}
