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
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
        cuántos de 2 dígitos, etcétera (hasta 5 dígitos). 
        */
        int i, N;
        Scanner leer=new Scanner(System.in);
        System.out.println("Digite el numero de variables que va a tener el vector");
        N=leer.nextInt();
        int[] vector=new int[N];
        for (i=0;i<=N-1;i++){
            vector[i]=leer.nextInt();
        }
        contabilidad(i,N,vector);
    }
    public static void contabilidad(int i, int N, int[] vector){
        int a,b,c,d,e;
        a=0;
        b=0;
        c=0;
        d=0;
        e=0;
        for (i=0;i<=N-1;i++){
            if ((vector[i]>=0)&&(vector[i]<=9)){
                a++;
            }else if((vector[i]>=10)&&(vector[i])<=99){
                b++;
            }else if((vector[i]>=100)&&(vector[i])<=999){
                c++;
            }else if((vector[i]>=1000)&&(vector[i])<=9999){
                d++;
            }else if((vector[i]>=10000)&&(vector[i])<=99999){
                e++;
            }
        }
        System.out.println("Hay "+a+" numeros de 1 digito, "+b+" numeros de 2 digitos, "+c+" numeros de 3 digitos, "+d+" numeros de 4 digitos y "+e+ " numeros de 5 digitos." );
    }
}
