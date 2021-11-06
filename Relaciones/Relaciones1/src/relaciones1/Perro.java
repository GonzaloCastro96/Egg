/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones1;

/**
 *
 * @author Gonzalo
 */
public class Perro {
    private String nombre;
    private Raza raza;
    private SexoAnimal sexo;
    private Integer edad;
    private String Tamano;

    public Perro() {
    }

    public Perro(String nombre, Raza raza, SexoAnimal sexo, Integer edad, String Tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.Tamano = Tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public SexoAnimal getSexo() {
        return sexo;
    }

    public void setSexo(SexoAnimal sexo) {
        this.sexo = sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamano() {
        return Tamano;
    }

    public void setTamano(String Tamano) {
        this.Tamano = Tamano;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", sexo=" + sexo + ", edad=" + edad + ", Tamaño=" + Tamano + '}';
    }
    
    
}
