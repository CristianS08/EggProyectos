
package ej1.servicios;

import ej1.Entidades.Perro;
import java.util.Scanner;

public class PerroServicios {
    
    Scanner imput = new Scanner(System.in).useDelimiter("\n");
    
    public Perro crearPerro(){
        
        System.out.println("Ingrese el nombre del perro");
        String nombre = imput.next();
        
        System.out.println("Ingrese la raza del perro");
        String raza = imput.next();
        
        System.out.println("Ingrese la edad del perro");
        int edad = imput.nextInt();
        
        System.out.println("Ingrese su tamaño");
        String tamaño = imput.next();
        
        return new Perro(nombre, edad, raza, tamaño);
    }
    
}
