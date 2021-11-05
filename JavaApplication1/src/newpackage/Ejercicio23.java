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
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
        pida al usuario un numero a buscar en el vector. El programa mostrará donde se
        encuentra el numero y si se encuentra repetido
         */
        int N, i, j, k;
        k = 0;
        System.out.println("Digite la cantidad de numeros del vector");
        Scanner leer = new Scanner(System.in);
        N = leer.nextInt();
        int[] vector = new int[N];
        for (i = 0; i <= N - 1; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        for (i = 0; i <= N - 1; i++) {
            System.out.println(vector[i]);
        }
        System.out.println("Dijite el numero a buscar");
        j = leer.nextInt();
        for (i = 0; i <= N-1; i++) {
            if (j== vector[i]) {
                System.out.println("El numero " + j + " se encuentra en la posición " + (i+1));
                k++;
            }else{
                System.out.println("");
            }
        }
    }
}
