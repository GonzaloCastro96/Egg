/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Circunferencia {
    private int R1;
    private int A;
    private int P;
    private Scanner leer=new Scanner(System.in);

    public Circunferencia() {
        this.A = (int) (Math.pow(R1,2)*PI);
        this.P= (int) (R1*2*PI);
    }

    public Circunferencia(int R1) {
        this.R1 = R1;
        this.A = (int) (Math.pow(R1,2)*PI);
        this.P= (int) (R1*2*PI);
    }

    public Circunferencia(int R1, int A, int P) {
        this.R1 = R1;
        this.A = A;
        this.P = P;
    }

    public void setR1(int R1) {
        this.R1 = R1;
    }

    public int getR1() {
        return R1;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "Radio=" + R1 + ", Area=" + A + ", Perimetro=" + P + '}';
    }
    
    
    
    
}

