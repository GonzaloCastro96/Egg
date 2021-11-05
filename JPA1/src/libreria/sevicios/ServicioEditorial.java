/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.sevicios;

import Persistencia.autorDAO;
import Persistencia.editorialDAO;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import libreria.entidades.editorial;

/**
 *
 * @author Gonzalo
 */
public class ServicioEditorial {
    Scanner leer= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    editorialDAO edao =new editorialDAO();
    
    public void CrearEditorial(){
        editorial e = new editorial();
        try {
            System.out.println("Digite el nombre de la Editorial");
                        e.setNombre(leer.next());
                        e.setAlta(Boolean.FALSE);
                        edao.create(e);
        } catch (Exception ex) {
            Logger.getLogger(autorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void EliminarEditorial() throws NonexistentEntityException{
        System.out.println("Digite el ID de la Editorial a eliminar");
        edao.destroy(leer.next());
    }
    public void ModificarEditorial() throws Exception {
        editorial e = new editorial();
        System.out.println("Digite el ID de la Editorial a modificar");
        e.setId(leer.next());
        e.setNombre(leer.next());
        edao.edit(e);
    }
}
