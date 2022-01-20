
package ejercicio4.main;

import ejercicio4.entidades.Nif;
import ejercicio4.servicios.NifServicios;

public class MainEj4 {

    public static void main(String[] args) {
        NifServicios nifServicios = new NifServicios();
        
        Nif nif = nifServicios.crearNif();
        
        nifServicios.mostrarDatos(nif);
    }
    
}
