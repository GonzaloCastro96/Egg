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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
        pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
        */
     String frase;
     boolean r;
    Scanner leer= new Scanner(System.in);
    frase=leer.next();
    r=frase.equalsIgnoreCase("Eureka");
    if (r=true){
        System.out.println("La frase es correcta");
            
    }else {
        System.out.println("La frase es incorrecta");
    }
    }
}
