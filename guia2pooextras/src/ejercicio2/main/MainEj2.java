
package ejercicio2.main;

import ejercicio2.entidades.Puntos;
import ejercicio2.servicios.PuntosServicios;
public class MainEj2 {

    public static void main(String[] args) {
        
        PuntosServicios puntosServicios = new PuntosServicios();
        
        Puntos puntos = puntosServicios.crearPuntos();
        
        System.out.println("La distancia entre los dos puntos es de: "+ puntosServicios.calcularDistancia(puntos));
    }
    
}
