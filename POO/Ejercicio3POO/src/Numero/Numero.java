/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numero;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Numero {
    Scanner leer= new Scanner(System.in);
    private int num1;
    private int num2;
    private int S;
    private int D;
    private int R;
    private int M;
    public Numero() {
    }

    public Numero(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Numero(int num1, int num2, int S, int D, int R, int M) {
        this.num1 = num1;
        this.num2 = num2;
        this.S = S;
        this.D = D;
        this.R = R;
        this.M = M;
    }

    public int getS() {
        return S;
    }

    public void setS(int S) {
        this.S = S;
    }

    public int getD() {
        return D;
    }

    public void setD(int D) {
        this.D = D;
    }

    public int getR() {
        return R;
    }

    public void setR(int R) {
        this.R = R;
    }

    public int getM() {
        return M;
    }

    public void setM(int M) {
        this.M = M;
    }
    
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public Numero crearOperacion(){
        System.out.println("Digite el primer numero");
        num1=leer.nextInt();
        System.out.println("Digite el segundo numero");
        num2=leer.nextInt();
        return new Numero(num1,num2);
    }
     public Numero Suma(){
        S = num1+num2;
        return new Numero(num1, num2, S, D, R, M);
    }
     public Numero Resta(){
        R=num1-num2;
        return new Numero(num1, num2, S, D, R, M);
    }
     public Numero Division(){
        D=0;
         if (num2==0){
            System.out.println("No se puede dividir por 0");
        }else{
           D=num1/num2;
        }
        return new Numero(num1, num2, S, D, R, M);
    }
     public Numero Multiplicacion(){
        M=0;
        if (num1==0 || num2==0){
            System.out.println("Al multiplicar por 0 todo da 0");
        }else{
            M=num1*num2;
        }
        return new Numero(num1, num2, S, D, R, M);
        
    }

    @Override
    public String toString() {
        return "Numero{ " + "num1=" + num1 + ", num2=" + num2 + ", Suma=" + S + ", Division=" + D + ", Resta=" + R + ", Multiplicación=" + M + '}';
    }

}