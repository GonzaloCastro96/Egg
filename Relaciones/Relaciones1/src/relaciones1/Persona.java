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
public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer DNI;
    private SexoPersona sexo;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer DNI, SexoPersona sexo, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public SexoPersona getSexo() {
        return sexo;
    }

    public void setSexo(SexoPersona sexo) {
        this.sexo = sexo;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public void CrearPersona(){
        
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", perro=" + perro + '}';
    }
    
    
}
