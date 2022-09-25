/**
 * @author DAW120
   📌 EJERCICIO 8, Hoja 2. 
   
   🔴 Programa que pide por teclado el radio de un círculo, 
      y visualiza luego su longitud y su área.
      
   🔴 Utiliza la clase scanner y Math y y los valores pueden contener decimales.
* 
*/
package com.solomongo.ejercicio8_hoja2;
import java.util.Scanner;


 public class Ejercicio8_Hoja2 {
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
        double radio, volumen;
        System.out.println("\nEscribe el radio del circulo: ");
        radio = sc.nextDouble();      
        System.out.println("Longitud del radio del circulo: "+(radio*2)); 
   
        /* ///////////////////////////////////////
                     process.. 45% 🏴‍
        /////////////////////////////////////// */
        
        System.out.println("\n\nArea del radio del circulo: "+radio+"="+ (4.0/3)* Math.PI * Math.pow(radio, 3)+"\n"); 
    }
}
