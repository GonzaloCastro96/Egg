/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7poo;

import java.util.Scanner;

/**
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
 */
public class PersonaServicio {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    private final int IMC_BAJO=-1;
    private final int IMC_IDEAL=0;
    private final int IMC_ALTO=1;
    public Persona crearPersona(){
        System.out.println("Ingrese su nombre");
        String nombre=leer.next();
        System.out.println("Ingrese edad");
        int edad= leer.nextInt();
        System.out.println("Ingrese sexo - H, M u O ");
        char sexo = Character.toUpperCase(leer.next().charAt(0));
        System.out.println("Peso en Kg");
        double peso= leer.nextDouble();
        System.out.println("Ingrese altura");
        double altura= leer.nextDouble();
        while (sexo!= 'H'|| sexo!='M'|| sexo!='O'){
            System.out.println("Ingrese una letra valida");
            sexo = Character.toUpperCase(leer.next().charAt(0));
        }
         while (peso<1){
            System.out.println("Ingrese una letra valida");
            peso=leer.nextDouble();
        }
         while (altura<1){
            System.out.println("Ingrese una letra valida");
            altura=leer.nextDouble();
        }
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    public int calcularIMC(Persona p){
        Double altura=p.getAltura();
        Double peso= p.getPeso();
        Double imc= peso/(Math.pow(altura,2));    
        if (imc<20){
            return IMC_BAJO;
        }else if(imc>20 && imc<25){
            return IMC_IDEAL;
        }else{
             return IMC_ALTO;
        }
    }
    
    public boolean esMayordeEdad(Persona p){
        boolean mayor = p.getEdad()>=18;
        return mayor;
    }
    
    public Persona[] crearPersonas(int cant){
        Persona[] personas =new Persona[cant];
        for (int i = 0; i < personas.length; i++) {
            personas[i]=crearPersona();
        }
        return personas;
    }
    
    public void porcentajesPeso(Persona[] personas){
        int contadorAlto=0;
        int contadorBajo=0;
        int contadorIdeal=0;
        int cantidadDePersonas=personas.length;
        for (Persona persona : personas) {
            switch(calcularIMC(persona)){
                case -1:
                    System.out.println(persona.getNombre()+"Esta por debajo de su peso ideal");
                    contadorBajo++;
                    break;
                case 0:
                    System.out.println(persona.getNombre()+"Esta en su peso ideal");
                    contadorIdeal++;
                    break;
                case 1:
                    System.out.println(persona.getNombre()+"Esta por encima su peso ideal");
                    contadorAlto++;
                    break;
            }
        }
        System.out.println("Hay "+ (contadorBajo*100/4) +"% de personas estan por debajo de su peso ideal.");
        System.out.println("Hay "+ (contadorIdeal*100/4) +"% de personas estan en su peso ideal.");
        System.out.println("Hay "+ (contadorAlto*100/4) +"% de personas estan por encima de su peso ideal.");
    }
    public void porcentajeEdad(Persona[] personas){
        int cantidadPersonas=personas.length;
        int contadorMayor=0;
        for (Persona persona : personas) {
            if (esMayordeEdad(persona)){
                contadorMayor++;
                System.out.println(persona.getNombre()+"es mayor de edad");
            }
            System.out.println("Hay "+(contadorMayor*100/cantidadPersonas)+"% son mayores de edad.");
            System.out.println("Hay "+(((cantidadPersonas-contadorMayor)*100)/cantidadPersonas)+"% son menores de edad.");
        }
    }
}
