
package ejercicio3.main;

import ejercicio3.entidades.Raices;
import ejercicio3.servicios.RaicesServicios;


public class MainEj3 {

    public static void main(String[] args) {
        
        RaicesServicios raicesServicios = new RaicesServicios();
        
        Raices r = raicesServicios.agregarValores();
        
        raicesServicios.calcularDiscriminante(r);
        
        if (raicesServicios.tieneRaices(r)==true){
            raicesServicios.obtenerRaices(r);
        } else if(raicesServicios.tieneRaiz(r)==true){
            raicesServicios.obtenerRaiz(r);
        } else{
            System.out.println("No es posible calcular la solucion");
        }
    }
    
}
