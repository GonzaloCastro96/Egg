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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
        la nota se pedirá de nuevo hasta que la nota sea correcta.
        */
        int nota;
        Scanner leer= new Scanner (System.in);
        do{System.out.println("Digite una nota entre 0 y 10");
           nota=leer.nextInt();
                    
        }while (nota<=0 && nota>=10);
        System.out.println("La nota esta entre el rango especificado");
    }
    
}
