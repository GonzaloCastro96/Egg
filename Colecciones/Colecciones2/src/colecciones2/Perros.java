/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones2;

/**
 *
 * @author Gonzalo
 */
public class Perros {
    String Raza;

    public Perros() {
    }

    public Perros(String Raza) {
        this.Raza = Raza;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    @Override
    public String toString() {
        return "Perros{" + "Raza=" + Raza + '}';
    }
    
}
