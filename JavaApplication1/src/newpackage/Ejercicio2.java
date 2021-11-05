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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Escribir un programa que pida dos números enteros por teclado y calcule la suma
            de los dos. El programa deberá después mostrar el resultado de la suma
        */
        Scanner leer= new Scanner (System.in);
        System.out.println("Digite 2 numeros para sumarlos");
        Double num1;
        Double num2;
        num1=leer.nextDouble();
        num2=leer.nextDouble();
        System.out.println(num1+num2);
    }
    
}
