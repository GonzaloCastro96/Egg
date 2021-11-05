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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        // Crear una variable Scanner utilizada para leer datos
        Scanner leer= new Scanner (System.in);
        // Crear una variable cadena (String) para leer datos del usuario
        String nombre;
        // Mostrar mensaje por pantalla
        System.out.println("Ingresa tu nombre");
        //Leemos el nombre
        nombre = leer.next();
        //mostramos por pantalla un saludo personalizado
        System.out.println("Hola Mundo! Soy "+ nombre +" y estoy programando en Java!");
        
    }
    
}
