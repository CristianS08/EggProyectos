
package guia1;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        /* Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        Scanner leer = new Scanner(System.in);
        
        float gradosC, gradosF;
        
        System.out.println("Ingrese una cantidad de grados centigrados");
        gradosC = leer.nextFloat();
        
        gradosF = 32 + (9* gradosC / 5);
        
        System.out.println("La cantidad de grados en fahrenheit es: " + gradosF);
    }
    
}
