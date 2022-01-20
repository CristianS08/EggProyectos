
package guia1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;


public class Ejercicio9 {

    public static void main(String[] args) {
        /* Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto*/
        
        Scanner leer = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase");
        frase= leer.nextLine();
        
        frase= toLowerCase(frase);
        
        if (frase.equals("eureka")){
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
    }
    
}
