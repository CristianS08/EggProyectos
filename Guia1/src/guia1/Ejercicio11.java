
package guia1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.substring;

public class Ejercicio11 {

    public static void main(String[] args) {
        /* Escriba un programa que pida una frase o palabra y valide si la primera letra de esa 
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”*/
        
       Scanner leer = new Scanner(System.in);
       
       String frase, letra;
       
        System.out.println("Ingrese una frase que comience con la letra A");
        frase = leer.nextLine();
        
        letra= frase.substring(0,1);
        
        if (letra.equals("a")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
