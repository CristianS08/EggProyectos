
package guia1;

import java.util.Scanner;


public class Ejercicio8 {


    public static void main(String[] args) {
        /* Crear un programa que dado un numero determine si es par o impar*/
        
        Scanner leer = new Scanner(System.in);
        
        int n;
        
        System.out.println("Ingrese un numero");
        n=leer.nextInt();
        
        if (n%2==0){
            System.out.println("El numero ingresado es par");
        } else{
            System.out.println("El numero ingresado es impar");
        }
    }
    
}
