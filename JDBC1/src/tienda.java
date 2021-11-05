/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import tienda.servicios.ServicioProducto;
import tienda.servicios.ServicioFabricante;
/**
 *
 * @author Gonzalo
 */
public class tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ServicioFabricante sf =new ServicioFabricante();
        ServicioProducto sp = new ServicioProducto();
        Integer r=0;
        Integer r2=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        do{
            Integer j=0;
            System.out.println("ELIJA UNA OPCIÓN");
            System.out.println("1. AÑADIR PRODUCTO");
            System.out.println("2. MODIFICAR PRODUCTO");
            System.out.println("3. ELIMINAR PRODUCTO");
            System.out.println("4. MOSTRAR PRODUCTOS");
            System.out.println("5. AÑADIR FABRICANTE");
            System.out.println("6. MODIFICAR FABRICANTE");
            System.out.println("7. ELIMINAR FABRICANTE");
            System.out.println("8. MOSTRAR FABRICANTES");
            System.out.println("9. SALIR");
            r=leer.nextInt();
            switch(r){
                case 1:
                    System.out.println("Digite la cantidad de Productos que va a añadir");
                    j=leer.nextInt();
                    for (int i = 0; i <= j; i++) {
                        sp.CrearProducto();
                    }
                    break;
                case 2:
                     System.out.println("Digite la cantidad de Productos que va a modificar");
                     j=leer.nextInt();
                    for (int i = 0; i <= j; i++) {
                        sp.ModificarProducto();
                    }
                    break;
                case 3:
                     System.out.println("Digite la cantidad de Productos que va a eliminar");
                     j=leer.nextInt();
                    for (int i = 0; i <= j; i++) {
                        sp.EliminarProducto();
                    }
                    break;
                case 4:
                    
                    break;
                case 5:
                     System.out.println("Digite la cantidad de Fabricantes que va a añadir");
                     j=leer.nextInt();
                    for (int i = 0; i <= j; i++) {
                      sf.CrearFabricante();  
                    }
                    break;
                case 6:
                     System.out.println("Digite la cantidad de Fabricantes que va a Modificar");
                     j=leer.nextInt();
                    for (int i = 0; i <= j; i++) {
                       sf.ModificarFabricante(); 
                    }
                    break;
                case 7:
                     System.out.println("Digite la cantidad de Fabricantes que va a eliminar");
                     j=leer.nextInt();
                    for (int i = 0; i <= j; i++) {
                        sf.EliminarFabricante();
                    }
                    break;
                case 8:
                    
                    break;
                case 9:
                    System.out.println("****SESION FINALIZADA****");
                    break;
                default:
                    System.out.println("Digite una opcion correcta");
                    break;
            }
        }while (r!=9);
        
    }
    
}
