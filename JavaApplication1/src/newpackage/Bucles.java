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
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer= new Scanner(System.in);
        do{
            System.out.println("Ingrese un numero positivo");
            num= leer.nextInt();
            if (num>1000){
                System.out.println("Este programa podria tardar, ¿Estas seguro? (s/n)");
                String confirma = leer.next();
                if (confirma.equals("s")){
                    break;
                }
            }
        }while (num<=0 || num>1000);
        int j, suma = 0, i;
        for (i=1; i<=num; i++){
            if (i%2 !=0)
                continue;
            suma=0;
            j=1;
            while(j<=i){
                suma+=j;
                j++;
            }
        }System.out.println("La suma de los "+ i + " numeros naturales es: "+ suma );
    }
    
}
