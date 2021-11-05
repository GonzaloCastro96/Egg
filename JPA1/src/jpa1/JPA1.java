/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa1;

import Persistencia.autorDAO;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.autor;
import libreria.sevicios.ServicioAutor;
import libreria.sevicios.ServicioEditorial;

/**
 *
 * @author Gonzalo
 */
public class JPA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NonexistentEntityException, Exception {
        Integer r=0;
        Integer r2=0;
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("");
        ServicioAutor sa=new ServicioAutor();
        ServicioEditorial se=new ServicioEditorial();
        do{
            Integer j=0;
            System.out.println("ELIJA UNA OPCIÓN");
            System.out.println("1. AÑADIR AUTOR");
            System.out.println("2. MODIFICAR AUTOR");
            System.out.println("3. ELIMINAR AUTOR");
            System.out.println("4. AÑADIR EDITORIAL");
            System.out.println("5. MODIFICAR EDITORIAL");
            System.out.println("6. ELIMINAR EDITORIAL");
            System.out.println("7. AÑADIR LIBRO");
            System.out.println("8. MODIFICAR LIBRO");
            System.out.println("9. ELIMINAR LIBRO");
            System.out.println("10. MOSTRAR");
            System.out.println("11. SALIR");
            
            r=leer.nextInt();
            switch(r){
                case 1:
                    System.out.println("Digite la cantidad de Autores que va a añadir");
                    j=leer.nextInt();
                    for (int i = 0; i < j ; i++) {
                      sa.CrearAutor();
                    }
                    break;
                case 2:
                     System.out.println("Digite la cantidad de Autores que va a modificar");
                     j=leer.nextInt();
                     for (int i = 0; i < j ; i++) {
                        sa.ModificarAutor();
                    }
                    break;
                case 3:
                     System.out.println("Digite la cantidad de Autores que va a eliminar");
                     j=leer.nextInt();
                     for (int i = 0; i < j ; i++) {
                        sa.EliminarAutor();
                    }
                    break;
                case 4:
                    System.out.println("Digite la cantidad de Editoriales que va a añadir");
                    j=leer.nextInt();
                     for (int i = 0; i < j ; i++) {
                        se.CrearEditorial();
                    }
                    break;
                case 5:
                    System.out.println("Digite la cantidad de Editoriales que va a Modificar");
                    j=leer.nextInt();
                     for (int i = 0; i < j ; i++) {
                        se.ModificarEditorial();
                    }
                    break;
                case 6:
                    System.out.println("Digite la cantidad de Editoriales que va a eliminar");
                    j=leer.nextInt();
                     for (int i = 0; i < j ; i++) {
                        se.EliminarEditorial();
                    }
                    break;
                case 7:
                     System.out.println("Digite la cantidad de Libros que va a añadir");
                     
                    break;
                case 8:
                    System.out.println("Digite la cantidad de Libros que va a Modificar");
                    
                    break;
                case 9:
                    System.out.println("Digite la cantidad de Libros que va a eliminar");
                    break;
                case 10:
                    System.out.println("Mostrar tablas");
                    break;
                case 11:
                    System.out.println("****SESION FINALIZADA****");
                    break;
                default:
                    System.out.println("Digite una opcion correcta");
                    break;
            }
        }while (r!=11);
        
    }
    
}
