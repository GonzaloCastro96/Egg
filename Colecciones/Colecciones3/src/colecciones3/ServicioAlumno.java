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
public class ServicioAlumno {

    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> Lista = new ArrayList();

    public ArrayList<Alumno> getLista() {
        return Lista;
    }

    public void setLista(ArrayList<Alumno> Lista) {
        this.Lista = Lista;
    }

    public ServicioAlumno() {
    }

    public void CrearLista() {
        String rta;
        do {
            Alumno a1 = new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            String nombre = leer.next();
            a1.setNombre(nombre);
            ArrayList Notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese una nota");
                Notas.add(leer.next());
            }
            a1.setNota(Notas);
            Lista.add(a1);
            System.out.println("Desea agregar otro alumno?");
            rta = leer.next();
        } while (rta.equalsIgnoreCase("si"));

    }

    public void BusquedaNF() {
        System.out.println("Digite el nombre del alumno que desea calcular el promedio.");
        String buscar = leer.next();
        Double n = null;
        for (Alumno aux : Lista) {
            if (aux.getNombre().equalsIgnoreCase(buscar)) {
                System.out.println(aux);
                for (int i = 0; i < 3; i++) {
                    n = n + aux.getNota().get(i);
                }break;
            }
        }

        System.out.println("El promedio es: " + n);
    }

    public void MostrarLista() {
        System.out.println(Lista.size());
        for (Alumno aux : Lista) {
            System.out.println(aux);
        }
    }
}
