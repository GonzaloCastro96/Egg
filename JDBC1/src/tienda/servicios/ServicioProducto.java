/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;
import tienda.entidades.Producto;
import java.util.Scanner;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author Gonzalo
 */
public class ServicioProducto {
    Scanner leer= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ProductoDAO pd;

    public ServicioProducto() {
        pd=new ProductoDAO();
    }
        
    public void CrearProducto() throws Exception{
        Producto p=new Producto();
        System.out.println("Digite el nombre del producto");
        p.setNombre(leer.next());
        System.out.println("Digite el codigo del producto");
        p.setCodigo(leer.nextInt());
        System.out.println("Digite el precio del producto");
        p.setPrecio(leer.nextDouble());
        System.out.println("Digite el codigo del fabricante");
        p.setCodigoFabricante(leer.nextInt());
        pd.guardarProducto(p);
    }

    public void ModificarProducto() throws Exception{
        Producto p=new Producto();
        try {
            if(p==null){
                throw new Exception("Debe indicar un producto a modificar");
            }   
        } catch (Exception e) {
            throw e;
        }
        System.out.println("Digite el codigo del producto que desea modificar");
        p.setCodigo(leer.nextInt());
        System.out.println("Digite el nuevo Nombre del producto");
        p.setNombre(leer.next());
        System.out.println("Digite el precio nuevo");
        p.setPrecio(leer.nextDouble());
        System.out.println("Digite el nuevo codigo de fabricante Codigo de Fabricante");
        p.setCodigoFabricante(leer.nextInt());
        pd.modificarProducto(p);
    }
    
    public void EliminarProducto() throws Exception{
        Producto p=new Producto();
        System.out.println("Digite el codigo del producto que quiere eliminar");
        p.setCodigo(leer.nextInt());
        pd.EliminarProducto(p);
        
    }
}
