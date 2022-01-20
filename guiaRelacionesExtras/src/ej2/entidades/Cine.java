
package ej2.entidades;

import java.util.HashSet;

public class Cine {
    
    private float precioEntrada;
    private HashSet<Sala> salas = new HashSet();
    

    public Cine() {
        
    }

    public Cine(float precio, HashSet<Sala> salas) {
        precioEntrada = precio;
        this.salas = salas;
    }


    public float getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(float precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public HashSet<Sala> getSalas() {
        return salas;
    }

    public void setSalas(HashSet<Sala> salas) {
        this.salas = salas;
    }

    @Override
    public String toString() {
        return "Cine{" + "precioEntrada=" + precioEntrada + ", salas=" + salas + '}';
    } 
    
    
}
