/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1poo;

import Libro.Libro;
import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Ejercicio1POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        Libro L1=new Libro(leer.next(), leer.nextInt(), leer.next(), leer.nextInt());
        System.out.println(L1);
    }
    
}
