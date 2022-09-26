/**
 * @author DAW120
   📌 EJERCICIO 8, Hoja 2. 
   
   🔴 Programa que pide por teclado el radio de un círculo, 
      y visualiza luego su longitud y su área.
      
   🔴 Utiliza la Clase Scanner y Math y y los valores pueden contener decimales.
*/
package com.solomongo.ejercicio8_hoja2;
import java.util.Scanner;  
 public class Ejercicio8_Hoja2 {
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in); // la Clase Scanner(MAY) pide datos por pantalla.
        double radio, longitud, area;  // declarar variables con double, posiaca..
        System.out.println("\nEscribe el radio del circulo: ");
        radio=sc.nextDouble();      
        System.out.println("Longitud del radio del circulo: "+(radio*2)); // aqui facil aplica la formula
        area= Math.PI*Math.pow(radio,2);  // el calculo de laformula, con metodo POW de Clase MATH..*****
        System.out.println("\nArea del radio del circulo: "+area);
 }
}

