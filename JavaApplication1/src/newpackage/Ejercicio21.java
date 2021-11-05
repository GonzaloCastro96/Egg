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
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crea una aplicación que a través de una función nos convierta una cantidad de
        euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
        libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
        converir que será una cadena, este no devolverá ningún valor y mostrará un 
        mensaje indicando el cambio (void)
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €
         */
        int a;

        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la cantidad de €");
        a = leer.nextInt();
        cambio(a);

    }

    public static void cambio(int a) {
        Scanner leer = new Scanner(System.in);
        boolean d;
        String b;
        do {
            System.out.println("Digite a que divisa quiere cambiarlo");
            b = leer.next();
            if (b.equalsIgnoreCase("Dolares")) {
                a = (int) (a * 1.28);
                d = true;
                break;
            } else if (b.equalsIgnoreCase("Yenes")) {
                d = true;
                a = (int) (a * 129.852);
                break;
            } else if (b.equalsIgnoreCase("Libras")) {
                d = true;
                a = (int) (a * 0.86);
                break;
            } else {
                d = false;
            }
        } while (d = true);
        System.out.println(a);
    }
}
