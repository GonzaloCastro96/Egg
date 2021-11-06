/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones3;

/**
 *
 * @author Gonzalo
 */
public class Colecciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
        información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
        pregunta al usuario si quiere crear otro Alumno o no. 
        */
        ServicioAlumno sa =new ServicioAlumno();
        sa.CrearLista();
        sa.MostrarLista();
        sa.BusquedaNF();
    }
    
}
