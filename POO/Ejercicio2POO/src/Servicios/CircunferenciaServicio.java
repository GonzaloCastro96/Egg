/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Circunferencia;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class CircunferenciaServicio {
    Scanner leer =new Scanner(System.in);
    public Circunferencia crearCircunferencia(){
        System.out.println("Digite el radio de la Circunferencia");
        int R1=leer.nextInt();
        return new Circunferencia(R1);
    }
   /* public Circunferencia ClacularArea(){
        int A=Circunferencia()^2*PI;
        return A;
    }
    */
    
}
