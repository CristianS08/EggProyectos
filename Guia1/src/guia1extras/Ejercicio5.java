
package guia1extras;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String tipoSocio;
        float monto;
        boolean bandera = true;

        System.out.println("Ingrese el monto del tratamiento\n");
        monto = leer.nextFloat();

        System.out.println("El monto a pagar sin descuento es de: $" + monto);

        do {
            System.out.println("¿Cual es su tipo de socio?");
            tipoSocio = leer.next();
            tipoSocio = toUpperCase(tipoSocio);

            switch (tipoSocio) {
                case "A":
                    monto = monto / 2;
                    break;
                case "B":
                    monto = (float) (monto - (monto * 0.35));
                    break;
                case "C":  ;
                    break;
                default:
                    bandera = false;
            }
        } while (bandera != true);

        System.out.println("\nEl monto total a pagar es de: $" + monto);

    }

}
