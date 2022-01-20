
package ej2.main;

import ej2.entidades.Cine;
import ej2.entidades.Espectador;
import ej2.entidades.Pelicula;
import ej2.entidades.Sala;
import ej2.servicios.Ejercicio2Servicios;
import java.util.Scanner;

public class Ej2Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Ejercicio2Servicios servicio = new Ejercicio2Servicios();
        
        
        System.out.println("*INGRESE LOS DATOS DEL CINE*");
        
        

        System.out.println("¿Que pelicula se reproducira?\n");
        Pelicula peli = servicio.crearPelicula();
        Sala sala = servicio.crearSala(peli);
        servicio.agregarSala(sala);
        
        Cine cine = servicio.crearCine();
            
        
        
        System.out.println("Ingrese los espectadores que veran la pelicula");
        String rta;
        do{
            Espectador espectador = servicio.crearEspectador();
            if(servicio.agregarEspectador(espectador, peli, cine)){
                servicio.asignarAsiento(espectador, sala);
            }else{
                System.out.println("La persona ingresada no puede ver la pelicula porque tiene una edad menor a la requerida o no tiene suficiente dinero");
            }
            
            
            System.out.println("\n¿Desea agregar un nuevo espectador?(S/N)");
            rta = input.next();
        }while(rta.toUpperCase().equals("S"));
        
        servicio.mostrarSala(sala);
        
    }
    
}
