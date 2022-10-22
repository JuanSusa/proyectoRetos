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
public class Reto4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int juego, eleccion;
        System.out.println("Vamos a jugar Piedra, Papel o Tijera \n donde vas marcar del 1 al 3 según con lo quieras jugar \n En donde 1, es Piedra \n 2 es Papel y \n 3 es Tijera");
        System.out.println("Digite un numero para comenzar el juego \n");
        
        eleccion = leer.nextInt();
        juego = (int)(Math.random()*3)+1;
        
        if(juego==1 && eleccion==1){
            System.out.println("Hubo empate,\n Salio piedra y usted escogio piedra");
        }
        else if (juego==1 && eleccion==2){
            System.out.println("Ganaste!\n Salio piedra y usted escogio papel ");
        }
        else if (juego==1 && eleccion==3){
            System.out.println("Perdiste!\n Salio piedra y usted escogio piedra");
        }
        else if (juego==2 && eleccion==1){
            System.out.println("Perdiste!\n Salio papel y usted escogio piedra");
        }
        else if (juego==2 && eleccion==2){
            System.out.println("Hubo empate\n Salio papel y usted escogio papel");
        }
        else if (juego==2 && eleccion==3){
            System.out.println("Ganaste!\n Salio papel y usted escogio papel");
        }
        else if (juego==3 && eleccion==1){
            System.out.println("Ganaste!\n Salio tijera y usted escogio piedra");
        }
        else if (juego==3 && eleccion==2){
            System.out.println("Perdiste!\n Salio tijera y usted escogio papel");
        }
        else if (juego==3 && eleccion==3){
            System.out.println("Hubo empate\n Salio tijera y usted escogio tijera");
        }
        else{
            System.out.println("Valor incorrecto");
        }
        leer.close();
    }
    
    
}
