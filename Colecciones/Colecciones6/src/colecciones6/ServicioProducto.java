/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class ServicioProducto {
    
    private HashMap<Producto, Integer> prod= new HashMap();
    Scanner leer =new Scanner(System.in);
    
    public void CrearProducto(){
        String s;
        Integer a;
        Producto p= new Producto();
        System.out.println("Digite el nombre del producto");
        s=leer.next();
        p.setNombre(s);
        System.out.println("Digite el precio del producto");
        a=leer.nextInt();
        prod.put(p, a);
    }
    
    public void MostrarProducto(){
        for(Map.Entry<Producto, Integer> aux: prod.entrySet()){
            Producto key=aux.getKey();
            Integer value=aux.getValue();
            System.out.println(key + " $" + value);
        }
    }
}
