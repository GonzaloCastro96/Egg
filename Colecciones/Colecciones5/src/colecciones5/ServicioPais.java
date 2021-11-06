/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones5;


import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Gonzalo
 */
public class ServicioPais{

    private TreeSet<Pais> Lista;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Pais e = new Pais();

    public ServicioPais() {
        this.Lista = new TreeSet();
    }
    
    public Pais CrearPais() {
        String a;
        System.out.println("Digite el pais");
        a = leer.next();
        return new Pais(a);
    }
    public void AgregarPais(Pais m){
        Lista.add(m);
    }
    public void CrearLista(){
        Pais m= CrearPais();
        AgregarPais(m);
    }
    
    public void MostrarLista() {
        System.out.println(Lista.size());
        for (Pais aux : Lista) {
            System.out.println(aux);
        }
  }    
//    public void (){
//    Collections.sort(Lista, Comparador.NombresAlfa);
//    System.out.println("Los directores ordenados alfabeticamente");
//    }

    public void EliminarporNombre(String buscar) {
        Iterator <Pais> it= Lista.iterator();
        boolean x;
        System.out.println("Paises ingresado");
        for (Pais aux : Lista) {
            System.out.println(aux);
        }
        
        while(it.hasNext()){
            Pais aux=it.next();
            if(buscar.equalsIgnoreCase(aux.getNombre())){
                for (int i = 0; i < Lista.size(); i++) {
                    Lista.remove(i);
                
            }
        }
    }
//      public void EliminarporNombre(String buscar) {
//        for (int i = 0; i < Lista.size(); i++) {
//            Pais p=Lista.getNombre(i);
//            if(p.getNombre().equals(buscar)){
//                Lista.remove(i);
//            }
//        }
//    }
}
}