
package guia1extras;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int minutos, horas, dias;

        System.out.println("Ingrese una cantidad en minutos");
        minutos = leer.nextInt();

        dias = 0;
        horas = 0;
        do {
            if (minutos >= 1440) {
                dias = dias + 1;
                minutos = minutos - 1440;
            } else if (minutos >= 60 && minutos < 1440) {
                horas = horas + 1;
                minutos = minutos - 60;
            }
        } while (minutos > 60);

        System.out.println("La cantidad de minutos ingresada es equivalente a: " + dias + " dias, " + horas + " horas, " + minutos + " minutos");

    }

}
