/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Alumno {

    /*
    Crear una clase llamada Alumno que mantenga información sobre las notas de
    distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
    de tipo Integer con sus 3 notas.
    Despues de ese bluce tendremos el siguiente método en la clase Alumno:
    
    Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
    su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
    método. Dentro del método se usará la lista notas para calcular el promedio final
    de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
    main
     */
    private String Nombre;
    private double NF;
    private ArrayList<Integer> Nota;
    Scanner leer = new Scanner(System.in);

    public Alumno() {
    }
    

    public double getNF() {
        return NF;
    }

    public void setNF(double NF) {
        this.NF = NF;
    }

    public Alumno(ArrayList<Integer> Nota) {
        this.Nota = Nota;
    }

    public Alumno(String Nombre, ArrayList<Integer> Nota) {
        this.Nombre = Nombre;
        this.Nota = new ArrayList();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Integer> getNota() {
        return Nota;
    }

    public void setNota(ArrayList<Integer> Nota) {
        this.Nota = Nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Nombre=" + Nombre + ", Nota=" + Nota + '}';
    }
}
