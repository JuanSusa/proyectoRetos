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
public class Reto2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int competidores;
        

        System.out.println("Digite la cantidad de competidores a participar ");
        competidores = leer.nextInt();

        String[] nombre = new String[competidores];
        int[] tiempo = new int[competidores];
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Ingrese el nombre del participante " + i);
            nombre[i] = leer.next();
        }
        System.out.println("En total habrá un total de " + competidores + " participantes en la competencia de natación.");

        for (int t = 0; t < tiempo.length; t++) {

            System.out.println("Ingrese el tiempo del participante " + t);
            tiempo[t] = leer.nextInt();
        }
        int tiempoMayor = 0;
        for (int x = 0; x < tiempo.length; x++) {
            
            if (tiempo[x] > tiempoMayor) {

                tiempoMayor = tiempo[x];
            }
        }
        
    }
}
