/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.entidades;

/**
 *
 * @author Gonzalo
 */
public class Producto {
    Integer codigo ;
    String nombre;
    Double precio;
    Integer codigoFabricante;
    

    public Producto() {
        
    }

    public Producto(Integer codigo, String nombre, Double precio, Integer codigoFabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigoFabricante = codigoFabricante;
    }
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(Integer codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }
}