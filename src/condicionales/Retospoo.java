/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionales;
import java.util.Scanner;
public class Retospoo {

    public static void main(String[] args) {
        
        //definir un objeto
        Scanner leer = new Scanner (System.in);
        
        //Reciba el dato del radio y calcular el area
        
        //datos de entrada
        final double PI=3.1416;
        double radio,area;
        
        System.out.println("Ingrese el radio del circulo");
        radio = leer.nextDouble();
        
        //Procesar la informacion
        area = PI*radio*radio;
        
        //salida
        System.out.println("el area del circulo " + radio + "es" + area);
        leer.close();
        }
    
}
