/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Nelsito
 */
public class swpropuesto1 {
    public static void main(String[] args){
    Scanner ingresar=new Scanner(System.in);
    double nota;
    System.out.println("favor ingresar un valor desde 1 hasta 10");
    nota=ingresar.nextDouble();
    
    while(nota<1 | nota>10 )
    {
    System.out.println("Lo siento mucho pero el valor proporcionado no es correcto");
    nota=ingresar.nextDouble();
      }
    }
}
