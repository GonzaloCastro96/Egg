/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Programa que lea la opinion de una pelicula
        */
        int opinion;
        Scanner leer= new Scanner(System.in);
        System.out.println("Diganos del 1 al 5 que calificación le pondria a la pelicula");
        opinion=leer.nextInt();
        if (opinion>=1 && opinion<=5) {
        switch (opinion) {
            case 1:
            case 2:
                System.out.println("Nos sentimos apenados de que no te haya gustado la pelicula");
                break;
            case 3:
                System.out.println("Has calificado la pelicula como buena");
                break;
            case 4:
                System.out.println("Has calificado la pelicula como muy buena");
                break;
            case 5:
                System.out.println("Fantastico que hayas disfrutado un excelente entretenimiento!");
            break;
                /*
            De otro modo se lo codifica como default
            */
        }
    } else if (opinion < 0) {    
        System.out.println("¿Tan mala fue la pelicula?");
    } else if (opinion == 0) {
        System.out.println("La calificación " +opinion+" es incorrecta, no se tomara en cuenta");
    } else{
        System.out.println(opinion+ " Gracias por una tan buena calificación");
    }
        System.out.println("Hasta la proxima :)");
    }
    
}
