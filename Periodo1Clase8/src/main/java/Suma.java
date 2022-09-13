/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Nelsito
 */
public class Suma {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    
    int numero1;
    int numero2;
    int suma;
    
    System.out.println("Escriba el primer entero: ");
    numero1 = entrada.nextInt();
    
    System.out.println("Escriba el segundo numero entero: ");
    numero2 = entrada.nextInt();
    
    suma = numero1 + numero2;
    
    System.out.println("La suma es " + suma);
    }   
}
