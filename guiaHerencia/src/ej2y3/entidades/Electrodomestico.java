
package ej2y3.entidades;

import java.util.Arrays;
import java.util.Scanner;

public class Electrodomestico {
    protected float precio;
    protected String color;
    protected String consumoEnergetico;
    protected float peso;

    protected Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Electrodomestico() {
    }

    public Electrodomestico(float precio, String color, String consumoEnergetico, float peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso ;
    }
    
    
    
    
    public void comprobarConsumoEnergetico(String letra){
        String [] consumos = {"A", "B", "C", "D", "E", "F"};
        
        if(!Arrays.toString(consumos).contains(letra.toUpperCase())){
            consumoEnergetico= "F";
        }
 
    }
    
    public void comprobarColor(String color){
        String [] colores = {"blanco", "negro", "rojo", "azul", "gris"};
        
        if(!Arrays.toString(colores).contains(color.toLowerCase())){
            this.color= "blanco";
        }
        
    }
    
    public void crearElectrodomestico(){
        precio = 1000;
        
        System.out.println("Ingrese el color");
        color = input.next();
        comprobarColor(color);
        
        System.out.println("Ingrese el consumo energetico");
        consumoEnergetico = input.next();
        comprobarConsumoEnergetico(consumoEnergetico);
        
        System.out.println("Ingrese el peso");
        peso = input.nextFloat();
    }
    
    public float precioFinal(){
        
        float precioFinal = precio;
         switch (consumoEnergetico) {
            case "A":
                precioFinal +=1000;
                break;
            case "B":
                precioFinal +=800;
                break;
            case "C":
                precioFinal +=600;
                break;
            case "D":
                precioFinal +=500;
                break;
            case "E":
                precioFinal +=300;
                break;
            case "F":
                precioFinal +=100;
                break;
        }
        if (peso < 0 && peso <= 19) {
            precioFinal +=100;
        } else if (peso > 19 && peso <= 49) {
            precioFinal +=500;
        } else if (peso > 49 && peso <= 79) {
            precioFinal +=800;
        } else {
            precioFinal +=1000;
        }
        
        return precioFinal;
    }
    
    
    

}
