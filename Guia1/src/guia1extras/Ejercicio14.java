
package guia1extras;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String opc;
        int n1, n2, resultado = 0;
        float resultadoD = 0;
        boolean bandera = true;

        do {
            do {

                System.out.println("¿Que desea hacer?");
                System.out.println("Sumar/Restar/Multiplicar/Dividir/Salir");
                opc = leer.next();
                opc = toLowerCase(opc);

                System.out.println("Ingrese 2 numeros");
                n1 = leer.nextInt();
                n2 = leer.nextInt();

                if (opc.equals("sumar") || opc.equals("restar") || opc.equals("multiplicar")) {
                    break;
                }

                if (n1 < 1 || n2 < 1 || n2 > n1) {
                    System.out.println("No se pueden dividir estos valores, ingreselos de nuevo");
                }

            } while (n1 < 1 || n2 < 1 || n2 > n1);

            switch (opc) {
                case "sumar":
                    resultado = suma(n1, n2);
                    break;
                case "restar":
                    resultado = resta(n1, n2);
                    break;
                case "multiplicar":
                    resultado = multi(n1, n2);
                    break;
                case "dividir":
                    resultadoD = div(n1, n2);
                    break;
                case "salir":
                    bandera = false;
            }

            if (opc.equals("sumar") || opc.equals("restar") || opc.equals("multiplicar")) {
                System.out.println("El resultado de la operacion es: " + resultado);
            } else if (opc.equals("dividir")) {
                System.out.println("El resultado de la operacion es: " + resultadoD);
            }

        } while (bandera == true);
    }

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    public static int multi(int num1, int num2) {
        return num1 * num2;
    }

    public static float div(int num1, int num2) {
        return num1 / num2;
    }

}
