
package ej2.main;

import ej2.entidades.Juego;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        Scanner imput= new Scanner(System.in).useDelimiter("\n");
        
        String rta;
        do{
            System.out.println("COMIENZA EL JUEGO DE LA RULETA DE AGUA");
        
            Juego juego = new Juego();
        
            juego.llenarJuego();
        
            String nombre = juego.ronda();
        
        
            System.out.println("El "+ nombre + " ha sido mojado");
            
            System.out.println("¿Desea volver a jugar?(S/N)");
            rta = imput.next();
        } while(rta.toUpperCase().equals("S"));
        
    }
    
}
