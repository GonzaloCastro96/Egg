/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7poo;

/**
 *
 * @author Gonzalo
 */
public class Ejercicio7POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaServicio servicio= new PersonaServicio();
        Persona listaPersonas[]=servicio.crearPersonas(4);
        
    }
    
}
