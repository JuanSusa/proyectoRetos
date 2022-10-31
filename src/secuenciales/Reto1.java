/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secuenciales;
import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        
        Scanner conversion = new Scanner(System.in);
        double gradosC,gradosF;
        
        System.out.println("Ingrese los grados a convertir ");
        gradosF = conversion.nextDouble();
        gradosC = (gradosF - 32)/1.8;
        System.out.println("los grados Centigrados a usar son " + gradosC);
        conversion.close();
        
        
        
    }
    
}
