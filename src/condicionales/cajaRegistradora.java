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
public class cajaRegistradora {
    public static void main(String[] args) {
        
        int op,precio, cantidad, referencia=0, subtotal, total=0, valorRecibido, cambio;
        Scanner valor = new Scanner (System.in);
        
        for (int i=1; i <=5; i ++){
            
            System.out.println("digite el precio: ");
            precio = valor.nextInt();
            
            System.out.println("Digite la cantidad de los productos: ");
            cantidad = valor.nextInt();
            subtotal = precio*cantidad;
            System.out.println(cantidad + " unidades del producto, de precio " + precio + " es " + subtotal );
            //Iniciar el contador de minutos 
            referencia = referencia + 1;
            //iniciamo el acomulador para el total de la compra
            total = total + subtotal;
            
        }
        
        System.out.println("La cantidad de minutos es de " + referencia);
        System.out.println("El total de su compra es " + total);
        
        System.out.println("Ingrese el valor con el que va a cancelar ");
        valorRecibido = valor.nextInt();
        cambio = valorRecibido-total;
        
        System.out.println("Su cambio es de " + cambio);
        System.out.println("¿Cuenta usted con telefonia movil? \n Marque 1 para si y 2 para no ");
        
        op = valor.nextInt();
        switch (op) {
            case 1 -> System.out.println("La cantidad de minutos que obtuvo por su compra son de " + referencia);
            case 2 -> System.out.println("No pierdad mas minutos, adquiera ya tu telefonia movil exito");
            default -> {
                System.out.println("Opcion no valida");;
            }
        }
        
        valor.close();
    }
    
}
