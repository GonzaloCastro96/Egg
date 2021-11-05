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
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
        del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
        por una E
        */
        Scanner leer =new Scanner(System.in);
        int num= 3;
        int i,j,k;
        for (i=0; i<=9; i++){            
            for (j=0; j<=9; j++){                
                for (k=0; k<=9; k++){
                 System.out.println("");
                    if (i==num){
                System.out.print("[E]");
            }else{
                System.out.print("["+ i+"]");
            }
                    if (j==num){
                System.out.print("[E]");
            }else{
                System.out.print("["+ j+"]");
            }
                    if (k==num){
                System.out.print("[E]");
            }else{
                System.out.print("["+ k+"]");
            }
                }
            }
        }
    }
    
}
