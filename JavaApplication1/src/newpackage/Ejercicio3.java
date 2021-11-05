/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Gonzalo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escribir un programa que pida una frase y la muestre toda en mayúsculas y
        después toda en minúsculas
        */
        Scanner leer=new Scanner(System.in);
        System.out.println("Escribir una frase");
        String frase;
        String mayus;
        String minus;
        frase= leer.next();
        mayus=toUpperCase(frase);
        minus=toLowerCase(frase);
        System.out.println(mayus);
        System.out.println(minus);
        
    }

}
