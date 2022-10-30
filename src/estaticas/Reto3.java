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
public class Reto3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int dinero,i,p,cambio;
        String codigo;
        
        String [][] maquina = {{"maniMoto","chocolatinaGol","galletasFestival","chocolatinaJumbo"},{"papasPollo","tostiArepa","tocinetaYupi","cheesetris"},{"chocolatinaJet","jumboBlanca","festivalLimon","festivalFresa"},{"miniChips","tostacos","choclitos","trocipollo"},{"chocoso","jugoHit","burbuja","jetBlanca"}};
        int [][] precios = {{2000,1200,1300,2400},{1900,1200,1500,1900},{1200,1800,900,900},{1400,1200,1400,1200},{1800,1500,700,1500}};
        
        for(int f=0;f<5;f++){
            
            for(int c=0;c<4;c++){
                System.out.print(" " + f + c + " ");
                System.out.println(" " + maquina[f][c] + " " + precios[f][c] + "\t");
                
            }
            System.out.print(" \n");
        }
        
        System.out.println("Ingrese el dinero ");
        dinero=leer.nextInt();
        System.out.println("Ingrese el código del producto ");
        codigo=leer.next();
        String submaquina = codigo.substring(0,1);
        i=Integer.parseInt (submaquina);
        String submaquina1 = codigo.substring(1,2);
        p=Integer.parseInt(submaquina1);
        
        if(dinero>(precios[i][p])){
            System.out.println("usted eligio el producto " + maquina[i][p] + " por un valor de " + precios[i][p]);
            System.out.println("va a cancelar con " + dinero);
            cambio = dinero-(precios[i][p]);
            System.out.println("Su cambio es de " + cambio);
        }
        
        else{
            System.out.println("Saldo insuficiente ");                
        }
        
        
    }   
}    
