/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nelsito
 */
public class Ejercicio1 {
    public static void main(String[] args){
    int day = 5;
    String dayString;
    switch (day)
    {
    case 1: dayString = "Lunes";
            break;
    case 2: dayString = "Martes";
            break;
    case 3: dayString = "Miercoles";
            break;
    case 4: dayString = "Jueves";
            break;
    case 5: dayString = "Viernes";
            break;
    case 6: dayString = "Sabado";
            break;
    case 7: dayString = "Domingo";
            break;
    default: dayString = "Dia inv[alido";
            break;
      }
    System.out.println(dayString);
    }
}
