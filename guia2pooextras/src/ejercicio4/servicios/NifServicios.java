
package ejercicio4.servicios;

import ejercicio4.entidades.Nif;
import ejercicio4.entidades.NifCalcula;
import java.util.Scanner;

public class NifServicios {
    
    Scanner imput = new Scanner(System.in).useDelimiter("\n");
    
    
    public Nif crearNif(){
        System.out.println("Ingrese su DNI");
        long dni = imput.nextLong();
        String letra = NifCalcula.calculaNif(dni);
        
        return new Nif(dni,letra);
    }
    
    public void mostrarDatos(Nif nif){
        System.out.println(nif.getDni()+"-"+nif.getLetra());
    }
    
}
