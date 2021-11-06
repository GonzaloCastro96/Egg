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
public class Producto {
    String Nombre;
    Integer Precio;
    private HashMap<String, Integer> prod= new HashMap();
    Scanner leer =new Scanner(System.in);
    public Producto(String Nombre) {
        this.Nombre = Nombre;
    }

    public Producto() {
    }

    public String getNombre() {
        return Nombre;
    }

    public Integer getPrecio() {
        return Precio;
    }

    public void setPrecio(Integer Precio) {
        this.Precio = Precio;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void CrearProducto(){
        String s;
        Integer a;
        Producto p= new Producto();
        System.out.println("Digite el nombre del producto");
        s=leer.next();
        System.out.println("Digite el precio del producto");
        a=leer.nextInt();
        p.setPrecio(a);
        prod.put(s, a);
    }
    
    public void MostrarProducto(){
        for(Map.Entry<String, Integer> aux: prod.entrySet()){
            String key=aux.getKey();
            Integer value=aux.getValue();
            System.out.println(key + " $" + value);
        }
    }
    
    public void EliminarProducto(){
        Producto P;
        String n = leer.next();
        System.out.println("Digite el producto que desea eliminar");
        prod.remove(n);
    }
    
    public void ModificarPrecio(){
        System.out.println("Digite el nombre del producto");
        String n=leer.next();
        for (Map.Entry<String,Integer> aux: prod.entrySet()) {
            String key=aux.getKey();
            Integer value=aux.getValue();
            if(key.equals(n)){
                System.out.println("Digite el nuevo precio");
            aux.setValue(leer.nextInt());
            }  
        }
    }
    
    @Override
    public String toString() {
        return "Producto:" + Nombre ;
    }
}
