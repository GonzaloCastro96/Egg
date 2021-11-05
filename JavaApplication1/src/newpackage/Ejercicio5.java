/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escribir un programa que lea un número entero por teclado y muestre por pantalla
        el doble, el triple y la raíz cuadrada de ese número
        */
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num= leer.nextInt();
        System.out.print("El doble del numero es "+ num*2);
        
        System.out.print("El triple del numero es "+ num*3);
        
        System.out.print("La raiz cuadrada del numero es "+ sqrt(num));
    }
}
