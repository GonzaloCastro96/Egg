/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Gonzalo
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
        muestre traspuesta
         */
        int i, j;
        int[][] matriz = new int[4][4];
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=(int)(Math.random()*10);
            }
        }
        System.out.println("La matriz es");
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                System.out.print(" ["+matriz[i][j]+"] ");
            }
            System.out.println(" ");
        }
            System.out.println("La matriz transpuesta es");
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                System.out.print(" ["+matriz[j][i]+"] ");
            }
            System.out.println(" ");
        }

    }

}
