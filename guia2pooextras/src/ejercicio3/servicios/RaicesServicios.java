
package ejercicio3.servicios;

import ejercicio3.entidades.Raices;
import java.util.Scanner;

public class RaicesServicios {
    
    Scanner imput = new Scanner(System.in);
    
    public Raices agregarValores(){
        System.out.println("Ingrese el coeficiente A");
        float a = imput.nextFloat();
        System.out.println("Ingrese el coeficiente B");
        float b = imput.nextFloat();
        System.out.println("Ingrese el coeficiente C");
        float c = imput.nextFloat();
        
        return new Raices(a,b,c);
    }
    
    public void calcularDiscriminante(Raices r){
        //  (b^2)-4*a*c
        r.setDiscriminante(((Math.pow(r.getB(), 2)-4)*r.getA()*r.getC()));
    }
    
    public boolean tieneRaices(Raices r){
        return r.getDiscriminante()>=0;
    }
    
    public boolean tieneRaiz(Raices r){
        return r.getDiscriminante()==0;
    }
    
    public void obtenerRaices(Raices r){
        //(-b±√((b^2)-(4*a*c)))/(2*a) 
        double a=r.getA();
        double b=r.getB();
        double c=r.getC();
        double parte1= Math.pow(b, 2)-(4*a*c);
        double parte2= Math.sqrt(parte1);
        double solucion1 = (-b+parte2)/(2*a);
        double solucion2 = (-b-parte2)/(2*a);
        System.out.println("Las 2 posibles soluciones son: ");
        System.out.println("1 --> "+ solucion1);
        System.out.println("2 --> "+ solucion2);
    }
    
    public void obtenerRaiz(Raices r){
        float a=r.getA();
        float b=r.getB();
        float c=r.getC();
        double solucion = (-b+Math.sqrt((Math.pow(b, 2))-(4*a*c)))/(2*a);
        System.out.println("La solucion es: \n"+solucion);
    }
}
