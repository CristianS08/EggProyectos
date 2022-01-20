
package ejercicio2.servicios;

import ejercicio2.entidades.Puntos;
import java.util.Scanner;

public class PuntosServicios {
    Scanner imput =  new Scanner(System.in);
    
    public Puntos crearPuntos(){
        System.out.println("Punto 1: ");
        System.out.println("Ingrese el valor de x");
        float x1= imput.nextFloat();
        System.out.println("Ingrese el valor de y");
        float y1= imput.nextFloat();
        
        System.out.println("Punto 2: ");
        System.out.println("Ingrese el valor de x");
        float x2= imput.nextFloat();
        System.out.println("Ingrese el valor de y");
        float y2= imput.nextFloat();
        
        return new Puntos(x1,x2,y1,y2); 
    }
    
    public double calcularDistancia(Puntos puntos){
        float x1 = puntos.getX1();
        float x2 = puntos.getX2();
        float y1 = puntos.getY1();
        float y2 = puntos.getY2();
        
        return Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
    }
}
