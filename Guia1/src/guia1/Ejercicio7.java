
package guia1;

import java.util.Scanner;

public class Ejercicio7 {

  
    public static void main(String[] args) {
        /* Implementar un programa que dado dos números enteros determine cuál es el 
mayor y lo muestre por pantalla.*/
        
        Scanner leer = new Scanner (System.in);
        
        float n1, n2;
        
        System.out.println("Ingrese el primer numero");
        n1 = leer.nextFloat();
        
        System.out.println("Ingrese el segundo numero");
        n2=leer.nextFloat();
        
        if (n1>n2){
            System.out.println("El numero "+n1+" es mayor que "+ n2);
        } else{
            System.out.println("El numero "+n2+" es mayor que "+ n1);
        }
    }
    
}
