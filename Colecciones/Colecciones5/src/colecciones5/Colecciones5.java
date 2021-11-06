/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones5;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Colecciones5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String a;
        Boolean x=false;
        ServicioPais p= new ServicioPais();
        
        do{
            p.CrearLista();
            do{
                System.out.println("Digite S para agregar otro");
                System.out.println("Digite N para salir");
                a=leer.next();
                if (a.equalsIgnoreCase("s")||(a.equalsIgnoreCase("n"))){
                    x=false;
                    break;
                }else{
                    System.out.println("Digite una opcion correcta");
                    x=true;
                }
            }while(x=true);
        }while(!a.equalsIgnoreCase("n"));
        p.MostrarLista();
        System.out.println("Ingrese el Pais que quiere elimnar");
        p.EliminarporNombre(leer.next());
        p.MostrarLista();
    }
    
}
