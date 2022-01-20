
package ej1.servicios;

import ej1.entidades.PerroExtra;
import ej1.entidades.PersonaExtra;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaServicios {
    
    Scanner imput;
    ArrayList <PersonaExtra> personas;

    public PersonaServicios() {
        imput = new Scanner(System.in).useDelimiter("\n");
        personas = new ArrayList();
    }
     
    public PersonaExtra crearPersona(PerroExtra perro){
        System.out.println("Registro de datos de la persona:\n");
        System.out.println("Ingrese su nombre");
        String nombre = imput.next();
        
        System.out.println("Ingrese su apellido");
        String apellido = imput.next();
        
        System.out.println("Ingrese su edad");
        int edad = imput.nextInt();
        
        System.out.println("Ingrese su documento");
        long doc = imput.nextLong();
        
        return new PersonaExtra(nombre,apellido,edad,doc,perro);
    } 
    
    public void agregarPersona(PersonaExtra persona){
        personas.add(persona);
    }
    
    public void mostrarPersonas(){
        for (PersonaExtra persona : personas) {
            System.out.println(persona);
        }
    }
}
