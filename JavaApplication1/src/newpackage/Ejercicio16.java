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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
        salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
        deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
        número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
        */
        int num,a,i,j;
        j=-1;
        a=0;
        Scanner leer=new Scanner(System.in);
        for (i=0; i<=20;i++){
            j++;
            System.out.println("Digite un numero");
            num=leer.nextInt();
            if (num>0){
                a=a+num;
            }else if(num<0){ 
                j=j-1;
            }else{
                i=20;
                break;
            }
        }
        System.out.println("Se sumaron "+ j +" numeros y su suma es " + a);
    }
    
}
