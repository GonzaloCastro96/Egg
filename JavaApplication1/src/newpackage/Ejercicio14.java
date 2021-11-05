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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
        solicite números al usuario hasta que la suma de los números introducidos supere
        el límite inicial. 
        */
        int num, i, j, k;
        System.out.println("Digite el numero limite");
        Scanner leer= new Scanner (System.in);
        num= leer.nextInt();
        j=0;
        do{
            System.out.println("Escriba otro numero");
            i = leer.nextInt();
            j+=i;
        }while (j<=num);
        System.out.println("El limite fue superado por " +(j-num));
    }
    
}
