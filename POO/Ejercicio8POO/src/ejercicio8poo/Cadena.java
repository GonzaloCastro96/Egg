/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8poo;

/*
 Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud.
A través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada.
 */
public class Cadena {
    private String frase;
    private Integer largo;

    public Cadena() {
    }

    public Cadena(String frase, Integer largo) {
        this.frase = frase;
        this.largo = largo;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", largo=" + largo + '}';
    }
}
