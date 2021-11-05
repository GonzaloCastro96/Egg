/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.sevicios;

import Persistencia.autorDAO;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import libreria.entidades.autor;
/**
 *
 * @author Gonzalo
 */
public class ServicioAutor {
    Scanner leer= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    autorDAO adao =new autorDAO();
    
    public void CrearAutor(){
        autor a=new autor();
        try {
            System.out.println("Digite el nombre del autor");
                        a.setNombre(leer.next());
                        a.setAlta(Boolean.FALSE);
                        adao.crear(a);
        } catch (Exception e) {
            Logger.getLogger(autorDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void EliminarAutor() throws NonexistentEntityException{
        System.out.println("Digite el ID del Autor a eliminar");
        adao.eliminar(leer.next());
    }
    public void ModificarAutor() throws Exception{
        autor a=new autor();
        System.out.println("Digite el ID del autor a modificar");
        a.setId(leer.next());
        a.setNombre(leer.next());
        adao.editar(a);
    }
}
