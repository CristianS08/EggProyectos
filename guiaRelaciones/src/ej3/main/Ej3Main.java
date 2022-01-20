
package ej3.main;

import ej3.servicio.CartasServicios;
import java.util.Scanner;

public class Ej3Main {

    public static void main(String[] args) {
        
        Scanner imput = new Scanner(System.in).useDelimiter("\n");
        CartasServicios servicio = new CartasServicios();
        
        System.out.println("*TIENE UNA BARAJA DE CARTAS EN SUS MANOS*");
        servicio.crearBaraja();
        
        System.out.println("\n¿Que desea hacer?");
        
        int opc;
        boolean rta=true;
        do{
            System.out.println("\n1. Barajar");
            System.out.println("2. Dar siguiente carta");
            System.out.println("3. Cartas disponibles");
            System.out.println("4. Dar un numero de cartas");
            System.out.println("5. Mostrar cartas que han salido");
            System.out.println("6. Mostrar baraja");
            System.out.println("7. Salir");
            opc = imput.nextInt();
            
            switch(opc){
                case 1: 
                    servicio.barajar();
                    break;
                case 2:
                    servicio.siguienteCarta();
                    break;
                case 3: 
                    servicio.cartasDisponibles();
                    break;
                case 4: 
                    System.out.println("¿Cuantas cartas quiere dar?");
                    int cant = imput.nextInt();
                    servicio.darCartas(cant);
                    break;
                case 5: 
                    servicio.mostrarCartasQueHanSalido();
                    break;
                case 6: 
                    servicio.mostrarBaraja();
                    break;
                case 7:
                    rta = false;
                    break;
                default: 
                    System.out.println("Opcion incorrecta");
            }
        } while(rta);
    }
    
}
