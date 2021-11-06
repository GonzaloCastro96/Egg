/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8poo;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ;
    public Cadena CrearFrase() {
        System.out.println("Digite la frase");
        String Frase = leer.next();
        int Largo = Frase.length();
        return new Cadena(Frase, Largo);
    }

    public int mostrarVocales(Cadena c) {
        String a;
        int contador = 0;
        int b = c.getFrase().length();
        for (int i = 0; i < b; i++) {
            a = (c.getFrase().substring(i, i + 1));
            if ((a.equalsIgnoreCase("a") || a.equalsIgnoreCase("E") || a.equalsIgnoreCase("I") || a.equalsIgnoreCase("O") || a.equalsIgnoreCase("U"))) {
                contador++;
                System.out.println("La frase tiene " + contador + " vocales");
            }
        }
        return contador;
    }

    public String InvertirFrase(Cadena c) {
        String FraseInvertida = "";
        int b = c.getFrase().length();
        for (int i = b; i > 0; i--) {
            FraseInvertida = FraseInvertida + c.getFrase().charAt(i);
        }
        System.out.println("La frase es: ");
        System.out.println(FraseInvertida);
        return FraseInvertida;
    }

    public int VecesRepetido(Cadena c) {
        int contador = 0;
        System.out.println("Digite la letra a buscar en la frase");
        char caracterUsuario = leer.next().charAt(0);
        for (int i = 0; i < c.getLargo(); i++) {
            if (caracterUsuario == c.getFrase().charAt(i)) {
                contador++;
            }
        }
        return contador;
    }
    
    public int CompararLongitud(Cadena c){
        
    }
}
