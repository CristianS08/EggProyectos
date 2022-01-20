
package guia1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        /* Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma
*/
        Scanner leer = new Scanner(System.in);
        int n1, n2;
        
        System.out.println("Ingrese dos numeros para sumarlos");
        n1=leer.nextInt();
        n2=leer.nextInt();
        
        System.out.println("La suma de los dos numeros es: "+(n1+n2));
    }
    
}

