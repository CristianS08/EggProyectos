
package guia1extras;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num, cont = 0, contP = 0, contI = 0;

        do {
            System.out.println("Ingrese un valor");
            num = leer.nextInt();

            if (num % 5 == 0) {
                break;
            }

            if (num % 2 == 0 && num >= 0) {
                contP++;
            } else if (num % 2 != 0 && num >= 0) {
                contI++;
            }

        } while (num % 5 != 0);
        
        cont=contP+contI;
        
        System.out.println("Se ingresaron una cantidad de "+ cont+" numeros");
        System.out.println(contP+" de ellos son pares");
        System.out.println("Y "+ contI+" son impares");

    }
    
}
