/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Nelsito
 */
public class Comparacion {
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    int numero1;
    int numero2;
    
    System.out.print("Escriba el primer entero: ");
    numero1 = entrada.nextInt();
    
    System.out.print("Escriba el segundo entero: ");
    numero2 = entrada.nextInt();
    
    if (numero1 == numero2)
        System.out.println("El numero " + numero1 + "es igual a " + numero2);
    
    if (numero1 != numero2)
        System.out.println("El numero " + numero1 + "es destinto a " + numero2);
    
    if (numero1 < numero2)
        System.out.println("El numero " + numero1 + "es menor a " + numero2);
    
    if (numero1 > numero2)
        System.out.println("El numero " + numero1 + "es mayor a " + numero2);
    
    if (numero1 <= numero2)
        System.out.println("El numero " + numero1 + "es menor o igual a " + numero2);
    
    if (numero1 >= numero2)
        System.out.println("El numero " + numero1 + "es mayor o igual a " + numero2);
  } 
}
