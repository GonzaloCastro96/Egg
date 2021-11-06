/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

/**
 *
 * @author Gonzalo
 */
public class Libro {
    private String Nombre;
    private int ISBN;
    private String Autor;
    private int Pag;

    public Libro() {
    }

    public Libro(String Nombre, int ISBN, String Autor, int Pag) {
        this.Nombre = Nombre;
        this.ISBN = ISBN;
        this.Autor = Autor;
        this.Pag = Pag;
    }

    @Override
    public String toString() {
        return "Libro{" + "Nombre=" + Nombre + ", ISBN=" + ISBN + ", Autor=" + Autor + ", Pag=" + Pag + '}';
    }
    
    
}
