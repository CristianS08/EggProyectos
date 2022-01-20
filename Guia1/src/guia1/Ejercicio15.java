
package guia1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        float n1, n2;
        String opc, rta;
        boolean bandera;
        
        System.out.println("Ingrese dos numeros");
        n1= leer.nextInt();
        n2= leer.nextInt();
        
        bandera= true;
        
        do{
            System.out.println("MENU");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Salir");
            System.out.println("Elija Opcion:");
            opc = leer.next();
            
            switch (opc){
                case "1": System.out.println("La suma de los numeros es: "+(n1+n2));break;
                case "2": System.out.println("La resta de los numeros es: "+(n1-n2));break;
                case "3": System.out.println("La multiplicacion de los numeros es: "+(n1*n2));break;
                case "4": System.out.println("La division de los numeros es: "+(n1/n2));break;
                case "5": System.out.println("¿Estas seguro que desea salir del programa? (S/N)");
                rta=leer.next();
                rta=toUpperCase(rta);
                if (rta.equals("S")){
                    bandera=false;
                }
        }
        }while(bandera != false);
    }
    
}
