/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones4;

/**
 *
 * @author Gonzalo
 */
public class Peliculas {
    String Nombre;
    String Director;
    Double Duracion;

    public Peliculas(String Nombre, String Director, Double Duracion) {
        this.Nombre = Nombre;
        this.Director = Director;
        this.Duracion = Duracion;
    }

    public Peliculas() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Double getDuracion() {
        return Duracion;
    }

    public void setDuracion(Double Duracion) {
        this.Duracion = Duracion;
    }

   
    @Override
    public String toString() {
        return "Peliculas{" + "Nombre=" + Nombre + ", Director=" + Director + ", Duracion=" + Duracion + '}';
    }
    
    
}
