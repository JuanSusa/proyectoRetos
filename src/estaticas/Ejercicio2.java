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
public class Ejercicio2 {
    public static void main(String[] args) {
        /*//1.Declarar la matriz
        int matriz1 [][] = new int [3][3];
        
        //2.Rellenar los datos manualmente por posicion
        matriz1[0][0]=30;
        matriz1[1][0]=85;
        matriz1[2][0]=32;
        
        //Imprimir una posicion de la matriz
        System.out.println(matriz1[2][0]);
         
        String [][] adso61 ={{"carlos","neider","Yurany","alex","wilson"},{"Gabriel","juan","diana","michel","cristian"},{"camilo","roberth","jhonatan","luis",""},{"victor","michael","lorena","jerome",""}};
        
        //4. Recorerr matriz
        for (int f=0;f<4;f++){
            //Entré a las filas
            for(int c=0;c<5;c++){
                //Entré a las columnas
                System.out.print(adso61[f][c]+ "\t");
            }
            System.out.println("");
        }*/
        
        //5. Rellenar matriz con datos ingresados por el usuario
        Scanner leer = new Scanner(System.in);
        String [][] adso61 =new String [4][5];
        //1er Bucle para rellenar la matriz
        for (int f=0;f<4;f++){
            //Entré a las filas
            for(int c=0;c<5;c++){
                //Entré a las columnas
                System.out.println("Ingrese el nombre de la posicion " + f +" "+ c);
                adso61[f][c] = leer.next();
            }
                                 
        }
        //2do bucle para imprimir
        for (int f=0;f<4;f++){
            //Entré a las filas
            for(int c=0;c<5;c++){
                //Entré a las columnas
                System.out.print(adso61[f][c] + "\t");
            }
            System.out.println("");                     
        }
    }
}
