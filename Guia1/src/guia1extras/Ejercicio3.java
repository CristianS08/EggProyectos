
package guia1extras;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String letra;

        System.out.println("Ingrese una letra");
        letra = leer.next();

        letra = toUpperCase(letra);

        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra es una consonante");
        }

    }

}
