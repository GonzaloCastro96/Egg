/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author Gonzalo
 */
public class ServicioFabricante {
    
    Scanner leer= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private FabricanteDAO fd;

    public ServicioFabricante() {
        fd=new FabricanteDAO();
    }

    public void CrearFabricante() throws Exception{
        Fabricante f=new Fabricante();
        System.out.println("Digite el nombre del Fabricante");
        f.setNombre(leer.next());
        System.out.println("Digite el codigo del Fabricante");
        f.setCodigo(leer.nextInt());
        fd.guardarFabricante(f);
    }
    
    public void ModificarFabricante() throws Exception{
        Fabricante f=new Fabricante();
        try {
            if(f==null){
                throw new Exception("Debe indicar un producto a modificar");
            }   
        } catch (Exception e) {
            throw e;
        }
        System.out.println("Digite el codigo del Fabricante que desea modificar");
        f.setCodigo(leer.nextInt());
        System.out.println("Digite el nuevo Nombre del Fabricante");
        f.setNombre(leer.next());
        fd.modificarFabricante(f);
    }
    
    public void EliminarFabricante() throws Exception{
        Fabricante f=new Fabricante();
        System.out.println("Digite el codigo del fabricante que quiere eliminar");
        f.setCodigo(leer.nextInt());
        fd.EliminarFabricante(f);
        
    }
    
    
}
