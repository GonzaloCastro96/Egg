/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones6;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Colecciones6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean c=false;
       Producto p = new Producto();
        System.out.println("1.Introducir un Producto"
                + "2.Modificar su precio"
                + "3.Eliminar un producto "
                + "4.Mostrar los productos que tenemos con su precio "
                + "5.Salir ");
        do {
            System.out.println("Digite el numero de la opcion que quiere utilizar");
            int x = leer.nextInt();
            switch (x) {
                case 1:
                    p.CrearProducto();
                    break;
                case 2:p.ModificarPrecio();
                    break;
                case 3:p.EliminarProducto();
                    break;
                case 4:p.MostrarProducto();
                    break;
                case 5:
                    c=true;
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Numero ingresado incorrecto");
                    break;
            }
        } while (c=true);
//        String a;
//        Boolean x=false;
//        ServicioProducto p= new ServicioProducto();
//        do{
//            p.CrearProducto();
//            do{
//                System.out.println("Digite S para agregar otro");
//                System.out.println("Digite N para salir");
//                a=leer.next();
//                if (a.equalsIgnoreCase("s")||(a.equalsIgnoreCase("n"))){
//                    x=false;
//                    break;
//                }else{
//                    System.out.println("Digite una opcion correcta");
//                    x=true;
//                }
//            }while(x=true);
//        }while(!a.equalsIgnoreCase("n"));
//        
    }
}
