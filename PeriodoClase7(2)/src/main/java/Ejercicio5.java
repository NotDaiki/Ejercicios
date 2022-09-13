/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Nelsito
 */
public class Ejercicio5 {
    public static void main(String[] args){
      Scanner Reader = new Scanner(System.in);
      int contador;
      int fin;
      System.out.println("Por favor ingrese el valor inicial (contador)");
      contador = Reader.nextInt();
      System.out.println("Por favor ahora ingrese el valor final");
      fin = Reader.nextInt();
      while(contador <= fin){
      System.out.println("Valor actual de la iteracion "+contador);
      contador++;
      }
    }
}
