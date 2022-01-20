
package guia1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Ejercicio4 {

    public static void main(String[] args) {
        /* Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
después toda en minúsculas*/
        
        Scanner leer = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase");
        frase= leer.nextLine();
        
        frase=toUpperCase(frase);
        
        System.out.println("Su frase en mayusculas es: " + frase);
        
        frase = toLowerCase(frase);
        
        System.out.println("Su frase en minusculas es: "+frase);
        
    }
    
}
