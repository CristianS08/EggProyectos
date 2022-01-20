
package guia1extras;

import java.util.Scanner;


public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int tam, i, j;
        String cad = "1";

        System.out.println("Ingrese el tamaño de la escalera");
        tam = leer.nextInt();

         for (i = 0; i <= tam; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("" + j);
            }
            System.out.println("");
        }
    }

}
