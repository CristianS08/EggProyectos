
package ej1.servicios;

import ej1.Entidades.Perro;
import ej1.Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaServicios {
    
    Scanner imput;
    ArrayList <Persona> personas;

    public PersonaServicios() {
        imput = new Scanner(System.in).useDelimiter("\n");
        personas = new ArrayList();
    }
    
    
    
    public Persona crearPersona(){
        Persona persona = new Persona();
        
        System.out.println("Ingrese el nombre de la primer persona");
        String nombre = imput.next();
        persona.setNombre(nombre);
        
        System.out.println("Ingrese el apellido de la primer persona");
        String apellido = imput.next();
        persona.setApellido(apellido);
        
        System.out.println("Ingrese la edad de la persona");
        int edad = imput.nextInt();
        persona.setEdad(edad);
        
        System.out.println("Ingrese el documento de la persona");
        long doc = imput.nextLong();
        persona.setDocumento(doc);
        
        return persona;
    } 
    
    public void agregarPersona(Persona persona){
        personas.add(persona);
    }
    
    public void asignarPerro(Persona persona, Perro perro){
        persona.setPerro(perro);
    }
    
    public void mostrarPersonas(){
        for (Persona aux : personas) {
            System.out.println(aux);
        }
    }
    
}
