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
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dibujar un cuadrado de N elementos por lado utilizando el carácter “*"
         */
        Scanner leer = new Scanner(System.in);
        int num, i, j;
        num = leer.nextInt();
        for (i = 0; i <= num; i++) {
            for (j = 0; j <= num; j++) {
                if (i==0 || j==0|| i==num || j==num){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

}
