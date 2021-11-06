/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clecciones1;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Clecciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ServicioPerros sp = new ServicioPerros();
        boolean n;
        String a;
        do {
            do {
                sp.CrearRaza();
                System.out.println("Digite ''S'' si quiere agregar otra raza.");
                System.out.println("Digite ''N'' para salir.");
                a = leer.next();
                n = (a.equalsIgnoreCase("S")|| (a.equalsIgnoreCase("N")));
            } while (n = false);
        } while (a.equalsIgnoreCase("S"));
        sp.MostrarPerro();
    }
}
