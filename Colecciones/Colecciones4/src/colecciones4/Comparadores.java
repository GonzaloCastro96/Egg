/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones4;

import java.util.Comparator;

/**
 *
 * @author Gonzalo
 */
public class Comparadores {

    public static Comparator<Peliculas> DuracionASC = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {

            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    
    public static Comparator<Peliculas> DuracionDSC = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {

            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    
    public static Comparator<Peliculas> OrdenTitulo = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getNombre().compareTo(t1.getNombre());
        }
    };
    
    public static Comparator<Peliculas> OrdenDirectores = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}
