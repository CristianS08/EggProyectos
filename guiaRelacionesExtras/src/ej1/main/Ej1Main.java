
package ej1.main;

import ej1.entidades.PerroExtra;
import ej1.entidades.PersonaExtra;
import ej1.servicios.PerroServicios;
import ej1.servicios.PersonaServicios;
import java.util.Scanner;

public class Ej1Main {

    public static void main(String[] args) {
        
        Scanner imput = new Scanner(System.in).useDelimiter("\n");
        PersonaServicios serviciosPer = new PersonaServicios();
        PerroServicios serviciosP = new PerroServicios();
        
        String rta;
        System.out.println("Ingrese los perros que se encuentren en la perrera\n");
        do{
            PerroExtra perro = serviciosP.crearPerro();
            String nombre = perro.getNombre();                  
            serviciosP.agregarPerro(perro, nombre);
            
            System.out.println("¿Desea agregar otro perro?");
            rta = imput.next();
        } while(rta.toUpperCase().equals("S"));
        
        int opc;
        boolean bandera= true;
        do{
            System.out.println("\n¿Que desea hacer?");
            System.out.println("1. Ingresar otro perro a la lista");
            System.out.println("2. Registrar una persona");
            System.out.println("3. Mostrar perros en la lista de adopcion");
            System.out.println("4. Mostrar personas registradas");
            System.out.println("5. Salir");
            opc = imput.nextInt();
            
            switch(opc){
                case 1: 
                    PerroExtra perro = serviciosP.crearPerro();
                    String nombre = perro.getNombre();
                    
                    serviciosP.agregarPerro(perro, nombre);
                    break;
                case 2:
                    System.out.println("Cual es el nombre del perro que desea adoptar");
                    String nombreP = imput.next();
                    boolean aux = serviciosP.existePerro(nombreP);
                    if(aux){
                        PerroExtra perroAux = serviciosP.traerPerro(nombreP);
                        PersonaExtra persona = serviciosPer.crearPersona(perroAux);
                        serviciosPer.agregarPersona(persona);
                        serviciosP.CambiarPerroDeLista(perroAux, nombreP);
                        break;
                    } else{
                        System.out.println("No existe el perro que desea adoptar");
                    }                    
                case 3:
                    serviciosP.mostrarPerros();
                    break;
                case 4: 
                    serviciosPer.mostrarPersonas();
                    break;
                case 5:
                    bandera = false;
            }
            
        }while(bandera);
        
    }
    
}
