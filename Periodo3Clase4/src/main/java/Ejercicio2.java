/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Nelsito
 */
public class Ejercicio2 {
    public static void main(String[] args){
      Scanner objetoNum = new Scanner (System.in);
      int valinicial, valfinal;
      
      valinicial=8;
      System.out.println("Multiplos de 8 hasta 500");
      while(valinicial<=500)
      {
        System.out.print( "Valinicial"+",");
        valinicial=valinicial+8;
        
       }
    }
}
