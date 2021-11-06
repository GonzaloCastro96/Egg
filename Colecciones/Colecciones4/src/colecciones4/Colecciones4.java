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
public class Colecciones4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String rta;
        ArrayList <Peliculas> Lista=new ArrayList();
        boolean x=false;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPeliculas sp = new ServicioPeliculas();
        do {
            sp.CrearLista();
            do {            
            System.out.println("Digite S para agregar otra pelicula y N para salir");
            rta = leer.next();
            if(( rta.equalsIgnoreCase("s") || rta.equalsIgnoreCase("n"))){
                x=false;
                break;
            }else{
                x=true;
            }
                if (x = false){
                    System.out.println("La letra ingresada es incorrecta");
                    break;
                }
            } while (x = false && rta.equalsIgnoreCase("N"));
        } while (rta.equalsIgnoreCase("S")&&(x=true));
        sp.MostrarLista();
        sp.Masde1H();
        sp.DuracionMayaMen();
        sp.MostrarLista();
        sp.DuracionMenaMay();
        sp.MostrarLista();
        sp.OrdenTitulo();
        sp.MostrarLista();
        sp.OrdenDirector();
        sp.MostrarLista();
    }

}
