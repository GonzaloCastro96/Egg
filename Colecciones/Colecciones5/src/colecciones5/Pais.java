/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones5;

import java.util.Scanner;


/**
 *
 * @author Gonzalo
 */
public class Pais implements Comparable<Pais>{
    String Nombre;
    Scanner leer =new Scanner (System.in);

    public Pais() {
    }
    

    public Pais(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Pais{" + "Nombre=" + Nombre + '}';
    }

    @Override
    public int compareTo(Pais t) {
        return this.Nombre.compareTo(t.getNombre());
    }
    
    
    
}
