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
public class VectoresyMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        int[] vector;
        vector = new int[2];
        int[] producto = new int[3];
        int[][] matriz = {{4, 8, 6}, {2, 1, 7}};
        System.out.println("ingrese los valoresdel vecotr de tamaño" + vector.length + ":");
        Scanner leer = new Scanner(System.in);
        for (i = 0; i <= vector.length; i++) {
            System.out.println("v[" + i + "]");
            vector[i] = leer.nextInt();
        }
        int sum = 0;
        int j;
        for (j = 0; j <= matriz[0].length; j++) {
            sum = 0;
            for (i = 0; i <= vector.length; i++) {
                sum += vector[i] * matriz[i][j];
            }
        }
        producto[j] = sum;
        String aux = "";
        System.out.println("* Vector");
        for (int elemento : vector) {
            aux = aux + "  " + elemento;
        }
        System.out.println(aux);

        System.out.println("/n* Matriz:");
        for (int[] fila : matriz) {
            aux = "";
        }
        for (int[]elemento:matriz){
            aux+="  "+ elemento;
        }
        System.out.println(aux);
        aux="";
        System.out.println("\n Vector x Matriz");
        for (int elemento:producto){
            aux+="  "+ elemento;
        }
        System.out.println(aux);
    }

}
