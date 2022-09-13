/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Nelsito
 */
public class Ejercicio4 {
    public static void main(String[] args){
      Scanner ingresar = new Scanner(System.in);
      System.out.println("ingrese el numero: ");
      int numero;
      numero = ingresar.nextInt();
      for(int i =1; 1<=10; i++){
          System.out.println(numero + "*" + i + "=" + numero * 1);
      }
    
    }
}
