/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estaticas;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //declarar un array
        int [] vector1 = new int [10];
        
        for(int p=0;p<10;p++){
        
        System.out.println("Ingrese el valor de la posiscion " + p);
        vector1[p]=entrada.nextInt();
        
        
        
        }
        //1.Llenar array de forma manual
        /*vector1[0]=30;
        vector1[1]=50;
        vector1[2]=25;
        vector1[3]=85;
        vector1[4]=12;
        vector1[5]=6;
        vector1[6]=32;
        vector1[7]=41;
        vector1[8]=23;
        vector1[9]=63;*/
        
        //2.Imprimir array con un for
        /*for (int p=0;p<vector1.length;p++){
           System.out.println("en la posicion " + p + "esta el valor " + vector1[p]);
        }
        
        System.out.println(vector1[5] + " " + vector1[8]);*/
        
        //3.Imprimir array con un for mejorado 
        /*for (int dato:vector1){
            System.out.println(dato);}*/
        
        
        
        
        
    }
    
}
