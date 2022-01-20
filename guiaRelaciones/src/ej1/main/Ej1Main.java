
package ej1.main;

import ej1.Entidades.Perro;
import ej1.Entidades.Persona;
import ej1.servicios.PerroServicios;
import ej1.servicios.PersonaServicios;
import java.util.Scanner;

public class Ej1Main {

    public static void main(String[] args) {
        
        Scanner imput = new Scanner(System.in).useDelimiter("\n");
        PersonaServicios personaServicio = new PersonaServicios();
        PerroServicios perroServicio = new PerroServicios();
        
        String rta;

        do{
            Persona persona;
            
            System.out.println("*Ingresamos persona*\n");
            persona = personaServicio.crearPersona();
            personaServicio.agregarPersona(persona);
            
            Perro perro;
            perro = perroServicio.crearPerro();
            personaServicio.asignarPerro(persona, perro);
            
            System.out.println("¿Desea agregar una nueva persona?(S/N)");
            rta = imput.next();
            
        } while(rta.toUpperCase().equals("S"));
        
        personaServicio.mostrarPersonas();
        
    }
    
}
