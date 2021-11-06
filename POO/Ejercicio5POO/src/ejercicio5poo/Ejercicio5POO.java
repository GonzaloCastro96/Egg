/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5poo;

import Cuenta.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Ejercicio5POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta C = new Cuenta();
        C.CrearCuenta();
        Scanner leer = new Scanner(System.in);
        System.out.println("1. Ingresar dinero.\n"
                + "2. Retirar \n"
                + "3. ExtraccionRapida: le permitirá sacar solo un 20% de su saldo\n"
                + "4. Consultar Saldo: permitirá consultar el saldo disponible en la cuenta.\n"
                + "5. Consultar Datos: permitirá mostrar todos los datos de la cuenta.\n"
                + "6. Salir");
        int a =0;
        do {
            a = leer.nextInt();
            switch (a) {
                case 1:
                    C.Ingreso();
                    break;
                case 2:
                    C.Retiro();
                    break;
                case 3:
                    C.ExtracciónRapida();
                    break;
                case 4:
                    C.ConsultSaldo();
                    break;
                case 5:
                    C.ConsultDatos();
                    break;
                case 6:
                    System.out.println("Hasta pronto!!");
                    break;
                default:
                    System.out.println("Digite un valor valido");
            }
        } while (a != 6);
    }
}
