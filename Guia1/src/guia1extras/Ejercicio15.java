
package guia1extras;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n;
        System.out.println("Ingrese la cantidad de personas");
        n = leer.nextInt();

        muestraPersona(n);

    }

    public static void muestraPersona(int tam) {
        Scanner leer = new Scanner(System.in);

        String[][] m = new String[tam][3];
        int i, j, aux;
        String rta;

        for (i = 0; i < tam; i++) {
            for (j = 0; j < 3; j++) {
                switch (j) {
                    case 0:
                        System.out.println("Ingrese el nombre de la persona " + (i + 1));
                        m[i][j] = leer.next();
                    case 1:
                        System.out.println("Ingrese su edad ");
                        m[i][j] = leer.next();
                    case 2:
                        aux = Integer.parseInt(m[i][1]);
                        System.out.println(aux);
                        if ( aux < 18) {
                            m[i][j] = "menor";
                        } else {
                            m[i][j] = "mayor";
                        }
                }
            }
        }

        System.out.println("Los datos de las personas son los siguientes:");

        i = 0;
        do {
            System.out.println("Nombre: " + m[i][0] + " | Edad: " + m[i][1] + " | " + m[i][2]);

            System.out.println("\n¿Desea ver los datos de la siguiente persona?");
            rta = leer.next();

            if (rta.equals("si")) {
                i++;
            } else {
                break;
            }
        } while (i < tam);
    }

}
