/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Nelsito
 */
public class Bandera {
   public static void main(String[] args){
   
     Scanner objeto=new Scanner (System.in);
     int valor, conteo = 0;
     double suma = 0;
     boolean seguir=false;
     
     while(!(seguir))
     {
     System.out.println("Ingresar un valor entero, el proceso finalizar[a cuando ingrese un m[ultiplo de 8");
     valor=objeto.nextInt();
     
        if((valor%8)==0)
        {
        seguir=true;
        }
        else 
        {
        conteo++;
        suma+=valor;
        }
     }
    if(conteo!=0)
     {
        System.out.println("La cantidad de valores ingresados es"+conteo);
     System.out.println("Chao, lea indicaciones");
    }
   }    
}
