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
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
        los muestre por pantalla en orden descendente.
        */
        int [] vector= new int[100];
        int i;
        for (i=0; i<=vector.length;i++){
            vector[i]=i;
            break;    
        }
        for(i=100; i>=0;i--){
            System.out.print("["+i+"]");
        }
    }
    
}
