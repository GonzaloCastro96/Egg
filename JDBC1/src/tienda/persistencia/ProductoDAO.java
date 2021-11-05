/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;
import java.util.Scanner;
import tienda.entidades.Producto;

/**
 *
 * @author Gonzalo
 */
public  class ProductoDAO extends DAO{
    
    Scanner leer = new Scanner(System.in);
    
    public ProductoDAO() {
     
    }
    
    public void guardarProducto(Producto p) throws Exception{
        try {
            if (p== null) {
                throw new Exception ("Debe indicar un producto");                
            }
            String sql = "INSERT INTO Producto(codigo, nombre, precio, codigofabricante)"
                    +"Values ( '"+ p.getCodigo()+ "' , '" + p.getNombre()+ "' , '" + p.getPrecio()+ "' , '" + p.getCodigoFabricante()+"');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarProducto(Producto p) throws Exception{
        try {
            if (p== null) {
                throw new Exception ("Debe indicar un producto para modificar");                
            }
            String sql = "Update Producto SET Nombre= '"+ p.getNombre()+ "' , precio= '" + p.getPrecio()+ "' , codigofabricante= '" + p.getCodigoFabricante()+"'Where Codigo= '" + p.getCodigo()+"';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void EliminarProducto(Producto p) throws Exception{
        try {
            if (p== null) {
                throw new Exception ("Debe indicar un producto para eliminarlo");                
            }
            String sql = "DELETE FROM Producto Where codigo= '"+p.getCodigo()+ "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Producto BuscarPorCodigo(Integer codigo) throws Exception{
        try {
            String sql= "SELECT * FROM Producto"
                    + "WHERE codigo = " +codigo;
            consultarBase(sql);
            Producto p=null;
            while(resultado.next()){
                p=new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                p.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return p;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
        
    }
}
