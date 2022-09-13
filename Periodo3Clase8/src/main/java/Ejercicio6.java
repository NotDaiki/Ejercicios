/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Nelsito
 */
public class Ejercicio6 {
    public static void main(String[] args){
      Scanner Reader = new Scanner(System.in);
      String quieroJugar = "si";
      while(quieroJugar.equals("si")){
      System.out.println("¿Quieres seguir jugando?");
      quieroJugar = Reader.next();
      }
    
    }
}
