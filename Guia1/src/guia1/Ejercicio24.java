
package guia1;

import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, tam, i;
        
        System.out.println("Ingrese el tamaño del vector");
        tam = leer.nextInt();
        
        int[] vec = new int[tam];

        for (i = 0; i < tam; i++) {
            vec[i] = (int) (Math.random() * 100000);
            
            
            System.out.println("["+vec[i]+"]");
        }

        for (i = 0; i < tam; i++) {

            if (vec[i] < 10) {
                cont1 = cont1 + 1;
            } else if ((vec[i] / 10) < 10) {
                cont2 = cont2 + 1;
            } else if ((vec[i] / 10) >= 10 && (vec[i] / 10) < 100) {
                cont3 = cont3 + 1;
            } else if ((vec[i] / 10) >= 100 && (vec[i] / 10) < 1000) {
                cont4 = cont4 + 1;
            } else if ((vec[i] / 10) >= 1000) {
                cont5 = cont5 + 1;
            }

        }

        System.out.println("La cantidad de elementos de 1 digito es de: " + cont1);
        System.out.println("La cantidad de elementos de 2 digitos es de: " + cont2);
        System.out.println("La cantidad de elementos de 3 digitos es de: " + cont3);
        System.out.println("La cantidad de elementos de 4 digitos es de: " + cont4);
        System.out.println("La cantidad de elementos de 5 digitos es de: " + cont5);

    }
}