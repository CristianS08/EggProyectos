
package guia1;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        /* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere 
el límite inicial. */
        
        Scanner leer = new Scanner(System.in);
        
        float n, suma, limite;
        
        System.out.println("Ingrese un limite positivo");
        limite= leer.nextFloat();
        
        System.out.println("Ingrese un valor");
        n= leer.nextFloat();
        
        suma=n;
        while(suma<=limite){
            System.out.println("Ingrese otro numero");
            n= leer.nextFloat();
            suma=suma+n;
        }
        
        System.out.println("La suma ha superado el valor limite");
    }
}
