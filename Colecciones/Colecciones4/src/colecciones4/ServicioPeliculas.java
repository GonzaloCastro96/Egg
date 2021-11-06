/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class ServicioPeliculas {
    ArrayList <Peliculas> Lista= new ArrayList();
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    public ServicioPeliculas() {
    }

    public ArrayList<Peliculas> getLista() {
        return Lista;
    }

    public void setLista(ArrayList<Peliculas> Lista) {
        this.Lista = Lista;
    }

    public void CrearLista(){
        Peliculas p1=new Peliculas();
        System.out.println("Digite el nombre de la pelicula");
        String n=leer.next();
        System.out.println("Digite el nombre del Director de la pelicula");
        String d=leer.next();
        System.out.println("Digite la duracion en horas");
        Double t=leer.nextDouble();
        p1.setNombre(n);
        p1.setDirector(d);
        p1.setDuracion(t);
        Lista.add(p1);
    }
    
    public void MostrarLista(){
        System.out.println(Lista.size());
        for (Peliculas aux : Lista) {
            System.out.println(aux);
        }
    }
   
    public void Masde1H(){
        for (Peliculas aux : Lista) {
            if (aux.getDuracion()>= 1.0){
                System.out.println("Las peliculas que duran mas de 1 hora son: ");
                System.out.println(aux.getNombre());
            }
        }
    }
    
    public void DuracionMayaMen(){
    Collections.sort(Lista, Comparadores.DuracionASC);
        System.out.println("Las Peliculas por duracion Ascendente");
    }
    
    public void DuracionMenaMay(){
    Collections.sort(Lista, Comparadores.DuracionDSC);
    System.out.println("Las Peliculas por duracion Descendente");
    }
    
    public void OrdenTitulo(){
    Collections.sort(Lista, Comparadores.OrdenTitulo);
    System.out.println("Las Peliculas Ordenadas alfabeticamente");
    }
    
    public void OrdenDirector(){
    Collections.sort(Lista, Comparadores.OrdenDirectores);
    System.out.println("Los directores ordenados alfabeticamente");
    }
    
    @Override
    public String toString() {
        return "ServicioPeliculas{" + "Lista=" + Lista + '}';
    }
    
}
