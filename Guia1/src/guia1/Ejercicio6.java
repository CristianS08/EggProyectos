
package guia1;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        /* Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número.*/
        
        Scanner leer = new Scanner (System.in);
        
        int n;
        float raiz;
        
        System.out.println("Ingrese un numero");
        n = leer.nextInt();
        
        raiz= (float) Math.sqrt(n);
        
        System.out.println("Su doble es: "+ (n*2)+"\n Su triple es: "+(n*3)+"\n Su raiz cuadrada es: "+ raiz);
    }
    
}
