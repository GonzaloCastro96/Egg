/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1;
/**
 *
 * @author Gonzalo
 */
public class Herencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal p=new Perro("Stich", "Pollo Hervido", 15, "Doberman");
        System.out.println(p.alimento);
        Animal p1=new Perro("Carmen", "Alimento Balanceado", 10, "Adoptado");
        System.out.println(p1.alimento);
        Animal g=new Gato("Ricardo", "Whiskas", 5, "Naranjoso");
        System.out.println(g.alimento);
        Animal c=new Caballo("Rayo", "Pasto", 8, "Fino");
        System.out.println(c.alimento);
    }
    
}
