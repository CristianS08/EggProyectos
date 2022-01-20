
package guia1extras;

import java.util.Scanner;


public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int i, n, num, max, min = 0, prom, suma;

        do{
        System.out.println("Ingrese la cantidad de numeros");
        n = leer.nextInt();
        }while(n < 0);
        
        i = 0;
        max = 0;
        suma = 0;
        while (i < n) {
                System.out.println("Ingrese un numero");
                num = leer.nextInt();

            if (i == 0) {
                min = num;
            } else if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }

            suma = suma + num;
            i++;
        }

        prom = suma / n;

        System.out.println("El valor maximo es el numero: " + max);
        System.out.println("\nEl valor minimo es el numero: " + min);
        System.out.println("\nEl promedio es: " + prom);
    }

}
