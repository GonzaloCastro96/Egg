/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2poo;

import Entidades.Circunferencia;
import Servicios.CircunferenciaServicio;
import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Ejercicio2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CircunferenciaServicio cs = new CircunferenciaServicio();
        Circunferencia C1 = cs.crearCircunferencia();
        System.out.println(C1);

    }

}
