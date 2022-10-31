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
public class Reto3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int aleatorio=0,respuesta,apuesta,acumulador=0;
        String co;
        System.out.println("ingrese el valor q desea recargar ");
        acumulador = leer.nextInt();
            do{
                System.out.println("ingrese el valor que desea apostar ");
                apuesta=leer.nextInt();
                System.out.println("Si desea jugar presione:\n 1 para elegir cara \n 2 para elegir sello");
                respuesta=leer.nextInt();
                System.out.println("la moneda se esta lanzando ");
                aleatorio=(int)(Math.random()*2)+1;
                if(aleatorio==1 && respuesta==1){
                    System.out.println("salio cara usted escogio cara ganaste! ");
                    acumulador=acumulador+apuesta;
                }
                else if(aleatorio==1 && respuesta==2){
                    System.out.println("salio cara usted escogio sello perdiste! ");
                    acumulador=acumulador-apuesta;
                    if(acumulador<=0){
                        System.out.println("su saldo es insuficiente ");
                        break;
                    }
                }
                else if(aleatorio==2 && respuesta==2){
                    System.out.println("salio sello usted escogio sello ganaste! ");
                    acumulador=acumulador+apuesta;
                }
                else if(aleatorio==2 && respuesta==1){
                    System.out.println("salio sello usted escogio cara perdiste! ");
                    acumulador=acumulador-apuesta;
                    if(acumulador<=0){
                        System.out.println("su saldo es insuficiente ");
                        break;
                    }
                }
                leer.nextLine();
                System.out.println("¿Desea seguir jugando?");
                co=leer.next();
                System.out.println("el dinero que acumulo es "+ acumulador);
            }
            while (co.equalsIgnoreCase("s"));
            leer.close();
    }
    
}
