/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Cuenta {
    private int num;
    private int DNI;
    private double saldo;
    Scanner leer =new Scanner(System.in);
    public Cuenta() {
    }

    public Cuenta(int num, int DNI, double saldo) {
        this.num = num;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public Cuenta CrearCuenta(){
        System.out.println("Digite su N° de cuenta");
        num=leer.nextInt();
        System.out.println("Digite su DNI");
        DNI=leer.nextInt();
        System.out.println("Digite su saldo");
        saldo=leer.nextDouble();
        return new Cuenta();
    }
    public Cuenta Ingreso(){
        System.out.println("Digite el deposito");
        double a= leer.nextDouble();
        saldo=saldo+a;
        return new Cuenta(num, DNI, saldo);
    }
    public Cuenta Retiro(){
        System.out.println("Digite el dinero a retirar");
        double b= leer.nextDouble();
        saldo=saldo-b;
        
        return new Cuenta(num, DNI, saldo);
    }
    public Cuenta ExtracciónRapida(){
        System.out.println("Se extraera el 20% del dinero total de la cuenta");
        saldo=saldo*0.80;
        return new Cuenta(num, DNI, saldo);
    }
    public Cuenta ConsultSaldo(){
        System.out.println("Su saldo es: "+ saldo);
        return new Cuenta();
    }
    public Cuenta ConsultDatos(){
        System.out.println("Sus Datos son: DNI "+ DNI+ " ,N° de cuenta "+ num );
        
        return new Cuenta();
    }

    @Override
    public String toString() {
        return "Cuenta{" + "num=" + num + ", DNI=" + DNI + ", saldo=" + saldo + '}';
    }
    
}
