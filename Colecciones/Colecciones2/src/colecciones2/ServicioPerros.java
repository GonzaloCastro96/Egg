/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class ServicioPerros {

    Scanner leer = new Scanner(System.in);
    private ArrayList<Perros> Razas;

    public ServicioPerros() {
        this.Razas = new ArrayList();
    }

    public Perros CrearPerro() {
        System.out.println("Digite una raza");
        String e;
        e = leer.next();
        return new Perros(e);
    }

    public void agregarPerros(Perros m) {
        Razas.add(m);
    }

    public void CrearRaza() {
        Perros m = CrearPerro();
        agregarPerros(m);
    }

    public void MostrarPerro() {
        for (Perros aux : Razas) {
            System.out.println(aux);
        }
        System.out.println(Razas.size());
    }

    public void EliminarporNombre(String raza) {
        for (int i = 0; i < Razas.size(); i++) {
            Perros p=Razas.get(i);
            if(p.getRaza().equals(raza)){
                Razas.remove(i);
            }
        }
    }
}
