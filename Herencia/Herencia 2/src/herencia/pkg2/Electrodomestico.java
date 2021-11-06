/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.pkg2;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Electrodomestico {
    private Integer precio;
    private String consumo;
    private String color;
    private Integer peso;
    
    Scanner leer=new Scanner(System.in);

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, String consumo, String color, Integer peso) {
        this.precio = precio;
        this.consumo = consumo;
        this.color = color;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    
    public void ComprobarConsumo(String consumo){
        switch (consumo){
            case "A":
                System.out.println("Letra correcta");
                break;
            case "B":
                System.out.println("Letra correcta");
                break;
            case "C":
                System.out.println("Letra correcta");
                break;
            case "D":
                System.out.println("Letra correcta");
                break;
            case "E":
                System.out.println("Letra correcta");
                break;
            case "F":
                System.out.println("Letra correcta");
                break;
            default:
                System.out.println("Letra incorrecta");
                consumo="F";
        }
    }
    
    public void ComprobarColor(String color){
        if (color.equalsIgnoreCase("azul")){
            System.out.println("Color correcto");
        }else if(color.equalsIgnoreCase("negro")){
            System.out.println("Color correcto");
        }else if(color.equalsIgnoreCase("blanco")){
            System.out.println("Color correcto");
        }else if(color.equalsIgnoreCase("rojo")){
            System.out.println("Color correcto");
        }else if(color.equalsIgnoreCase("gris")){
        }else{
            System.out.println("Color incorrecto");
            color="blanco";
        }
    }
    
    public void crearElectrodomestico(){
        ComprobarConsumo(leer.next());
        
    }
}
