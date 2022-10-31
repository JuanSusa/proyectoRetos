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
public class Reto6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int precio, cantidad, valor=0, juego, subtotal=0, valorRecibido;
        double descuento,total=0.0, cambio;
        String eleccion;
        
        System.out.println("Desea registrar un producto");
        eleccion = leer.next();
        
        while(eleccion.equals("si")){
               
        System.out.println("Digite la cantidad de productos");
        cantidad = leer.nextInt();
        
        System.out.println("Digite el precio del producto");    
        precio = leer.nextInt();
        
        subtotal= precio*cantidad;
        System.out.println("La compra es de " + cantidad + " unidades por un valor de " + subtotal);
        valor = valor+ subtotal;
        System.out.println("El valor de la compra es de " + valor);
        System.out.println("Desea registrar un producto");
        eleccion = leer.next();
        }
  
        juego = (int)(Math.random()*4)+1;
                
        if(valor>=50000){
            System.out.println("Puedes participar en el sorteo");
            
            switch (juego) {
                case 1 -> {
                    System.out.println("Sacaste bolita roja, obtuviste un descuento del 10%");
                    descuento = valor*0.10;
                    total = valor - descuento;
                    System.out.println("El valor a pagar es de " + total);
                }
                case 2 -> {
                    System.out.println("Sacaste bolita azul, obtuviste un descuento del 30%");
                    descuento = valor*0.30;
                    total = valor - descuento;
                    System.out.println("El valor a pagar es de " + total);
                }
                case 3 -> {
                    System.out.println("Sacaste bolita amarilla, obtuviste un descuento del 50%");
                    descuento = valor*0.50;
                    total = valor - descuento;
                    System.out.println("El valor a pagar es de " + total);
                }
                case 4 -> System.out.println("Sacaste bolita blanca, tu compra es totalmente gratis");
                default -> {
                }
            }
        }
        else{
            System.out.println("No puedes participar en el sorteo");
        }
        
        System.out.println("Ingrese el valor con el que desea cancelar ");
        valorRecibido = leer.nextInt();
        cambio= valorRecibido - total;
        System.out.println("El valor de la compra es de " + total + "\n usted cancela con " + valorRecibido + "\n y su cambio es de " + cambio);    
        
        
        
        
        
        
    }
    
}
