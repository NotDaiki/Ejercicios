/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nelsito
 */
public class Ejercicio2 {
    public static void main(String[] args){
    String branch = "CSE";
    int year = 2;
    
    switch(year)
    {
        case 1 :
            System.out.println("Cursos electivos: ingles, Calculo");
            break;
        case 2 : 
            switch (branch)
            {
                case "CSE":
                case "CCE":
                    System.out.println("Cursos electivos : Machine learning, Big Data");
                    break;
                    
                case "ECE":
                    System.out.println("Cursos electivos : Programacion");
                    break;
                    
                default:
                    System.out.println("Cursos electivos : Ingenieria de Software");
            }
        }    
    }
    
}
