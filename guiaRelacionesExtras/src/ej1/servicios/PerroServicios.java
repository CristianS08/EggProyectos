
package ej1.servicios;

import ej1.entidades.PerroExtra;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PerroServicios {
    Scanner imput;
    HashMap<String , PerroExtra> perrosEnAdopcion;
    HashMap<String , PerroExtra> perrosAdoptados;

    public PerroServicios() {
        imput = new Scanner(System.in).useDelimiter("\n");
        perrosEnAdopcion = new HashMap();
        perrosAdoptados = new HashMap();
    }
    
    
    
    public PerroExtra crearPerro(){      
        System.out.println("Ingrese el nombre del perro");
        String nombre = imput.next();
        
        System.out.println("Ingrese la raza del perro");
        String raza = imput.next();
        
        System.out.println("Ingrese la edad del perro");
        int edad = imput.nextInt();
        
        System.out.println("Ingrese su tamaño");
        String tamaño = imput.next();
        
        return new PerroExtra(nombre, edad, raza, tamaño);
    }
    
    public void agregarPerro(PerroExtra perro, String nombre){
        perrosEnAdopcion.put(nombre, perro);
    }
    
    
    public boolean existePerro(String nombre){
        boolean rta=false;
        for (Map.Entry<String, PerroExtra> aux : perrosEnAdopcion.entrySet()) {
            String key = aux.getKey();
            if(key.equals(nombre)){
                rta = true;
            }
        }
        return rta;
    }

    public PerroExtra traerPerro(String nombre){
        PerroExtra perrito = new PerroExtra();
        for (Map.Entry<String, PerroExtra> aux : perrosEnAdopcion.entrySet()) {
            String key = aux.getKey();
            PerroExtra value = aux.getValue();
            if(key.equals(nombre)){
                perrito = value;
            }
        }
        return perrito;
    }
    
    public void CambiarPerroDeLista(PerroExtra perro, String nombre){
        perrosAdoptados.put(nombre, perro);
        perrosEnAdopcion.remove(nombre);
    }
    
    public void mostrarPerros(){
        for (Map.Entry<String, PerroExtra> aux : perrosEnAdopcion.entrySet()) {
            PerroExtra value = aux.getValue();
            System.out.println(value);
        }
    }
}
