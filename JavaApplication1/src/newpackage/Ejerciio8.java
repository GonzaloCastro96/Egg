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
public class Ejerciio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crear un programa que dado un numero determine si es par o impar.
        */
        Scanner leer= new Scanner(System.in);
        int num;
        int R;
        System.out.println("Digite un numero");
        num=leer.nextInt();
        if(num == 0) {
            System.out.println("El numero no es par ni impar");   
        } 
        else if (2%num==0) {
        System.out.println("El numero es par");
        }   else{
            System.out.println("El numero es impar");
        }
    }
    
}
