
package guia1extras;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int tam, suma=0;
        
        System.out.println("Ingrese el tamaño del vector");
        tam= leer.nextInt();
        
        int [] vector= new int [tam];
        
        for (int i=0;i<tam;i++){
            System.out.println("Ingrese el valor de la posicion "+ (i+1));
            vector[i]= leer.nextInt();
            suma+=vector[i];
        }
        
        System.out.println("La suma de todos los elementos del vector es: "+ suma);
    }
    
}
