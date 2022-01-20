
package guia1;

import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int i, j, k, tam;
        int suma, sumaf, sumac, sumad;
        boolean bandera = true;

        System.out.println("Ingrese el tamaño de la matriz magica");
        tam = leer.nextInt();
        int[][] m = new int[tam][tam];

        for (i = 0; i < tam; i++) {
            for (j = 0; j < tam; j++) {
                do {
                    System.out.println("Ingrese el elemento [" + i + "," + j + "]");
                    m[i][j] = leer.nextInt();
                } while ((m[i][j]) > 10 && (m[i][j] < 0));
            }
        }
        
        for (i = 0; i < tam; i++) {
            for (j = 0; j < tam; j++) {
                System.out.print("[" + m[i][j] + "]");
            }
            System.out.println("");
        }

        //suma de los elementos de la primera fila
        suma = 0;
        for (i = 0; i < tam; i++) {
            suma = suma + m[0][i];
        }

        sumad = 0;
        for (i = 0; i < tam; i++) {
            sumaf = 0;
            sumac = 0;
            for (j = 0; j < tam; j++) {
                sumaf = sumaf + m[i][j];
                sumac = sumac + m[j][i];
                if (i == j) {
                    sumad = sumad + m[i][j];
                }
            }
            if ((sumaf != suma) || (sumac != suma)) {
                bandera = false;
            }
        }
        if (sumad != suma) {
            bandera = false;
        }

        //compruebo diagonal secundaria
        sumad = 0;
        k = tam - 1;
        for (i = 0; i < tam; i++) {
            sumad = sumad + m[i][k];
            k--;
        }
        

        if (sumad != suma) {
            bandera = false;
        }

        if (bandera == false) {
            System.out.println("La matriz ingresada no es una matriz magica");
        } else {
            System.out.println("La matriz ingresada es una matriz magica");
        }
    }

}
