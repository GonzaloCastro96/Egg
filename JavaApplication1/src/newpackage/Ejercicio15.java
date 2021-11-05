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
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que pida dos números enteros positivos por teclado y
        muestre por pantalla el siguiente menú:
        MENU
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir
        5. Salir
        Elija opción:
        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
        pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
        opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
        del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
        ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
        carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú
         */
        int num1, num2,a;
        String X;
        Scanner leer = new Scanner(System.in);
        boolean r;
        X="a";
        System.out.println("Digite 2 numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        while (num1 < 0 && num2 < 0) {
            System.out.println("Digite 2 numeros positivos");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
        }
        System.out.println("Elija uno de los numeros del menu/n"
                + "        1. Sumar\n"
                + "        2. Restar\n"
                + "        3. Multiplicar\n"
                + "        4. Dividir\n"
                + "        5. Salir");
        do{
            a= leer.nextInt();
            switch(a){
            case 1:
                System.out.println("La suma de los numeros es " +(num1+num2));
                break;
            case 2:
                System.out.println("La resta de los numeros es "+(num1-num2));
                break;
            case 3:
                System.out.println("La multiplicación de los numeros es "+(num1-num2));
                break;
            case 4:
                System.out.println("La división de los numeros es "+(num1-num2));
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                X=leer.next();
                break;
        }
        
             
        }while(X.equalsIgnoreCase("n"));
    }

}
