/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;
import tienda.entidades.Fabricante;

/**
 *
 * @author Gonzalo
 */
public final class FabricanteDAO extends DAO {
    
     public void guardarFabricante(Fabricante f) throws Exception{
        try {
            if (f== null) {
                throw new Exception ("Debe indicar un fabricante");                
            }
            String sql = "INSERT INTO Fabricante(codigo, nombre)"
                    +"Values ( '"+f.getCodigo()+ "' , '" + f.getNombre()+"');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarFabricante(Fabricante f) throws Exception{
        try {
            if (f== null) {
                throw new Exception ("Debe indicar un fabricante para modificar");                
            }
            String sql = "Update Producto SET Nombre= '"+ f.getNombre()+ "'WHERE Codigo= '" + f.getCodigo()+"');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void EliminarFabricante(Fabricante f) throws Exception{
        try {
            if (f== null) {
                throw new Exception ("Debe indicar un fabricante para eliminarlo");                
            }
            String sql = "DELETE FROM Fabricante Where codigo= '"+f.getCodigo()+ "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
}
