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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Implementar un programa que dado dos números enteros determine cuál es el
        mayor y lo muestre por pantalla.
        */
        int a;
        int b;
        System.out.println("Digite 2 numeros");
        Scanner leer= new Scanner(System.in);
        a=leer.nextInt();
        b=leer.nextInt();
        if (a>b){
            System.out.println(a+ " es mayor que " +b);
        }else if(b>a) {
            System.out.println(b+ " es mayor que " +a);
        }else {
        System.out.println("Los numeros son iguales");
    }
    }
    
}
