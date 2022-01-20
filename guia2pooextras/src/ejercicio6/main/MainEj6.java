
package ejercicio6.main;

import ejercicio6.entidades.Ahorcado;
import ejercicio6.servicios.AhorcadoServicios;
import java.util.Scanner;

public class MainEj6 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in).useDelimiter("\n");
        
        AhorcadoServicios ahorcadoServicios = new AhorcadoServicios();
        
        Ahorcado ahorcado= ahorcadoServicios.crearJuego();
        ahorcadoServicios.longitud(ahorcado);
        
        
        boolean bandera= true;
        do{
            System.out.println("Ingrese una letra");
            String letra = imput.next();
            
            ahorcadoServicios.buscar(ahorcado, letra);
            ahorcadoServicios.encontradas(ahorcado, letra);
            ahorcadoServicios.mostrarCantIntentos(ahorcado);
            
            if(ahorcado.getCantJugadasMax()==0 || ahorcado.getCantLetrasEncontradas()== ahorcado.getBuscar().length){
                bandera=false;
            }
        }while(bandera==true);
    }
    
}
