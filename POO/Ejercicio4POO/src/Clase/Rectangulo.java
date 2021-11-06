/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Rectangulo {

    int base;
    int altura;
    int i, j;
    Scanner leer = new Scanner(System.in);

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura, int i, int j) {
        this.base = base;
        this.altura = altura;
        this.i = i;
        this.j = j;
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Rectangulo CrearRectangulo() {
        System.out.println("Digite la base");
        base = leer.nextInt();
        System.out.println("Digite la altura");
        altura = leer.nextInt();
        return new Rectangulo(base, altura);
    }

    public Rectangulo Dibujado() {
        for (i = 0; i <= altura-1; i++) {
            for (j = 0; j <= base-1; j++) {
                if (i == 0 || j == 0 || i == altura-1 || j == base-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        return new Rectangulo(base, altura, i, j);
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

}
