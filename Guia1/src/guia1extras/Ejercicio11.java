
package guia1extras;

import java.util.Scanner;


public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num, cont=1;
        
        System.out.println("Ingrese un numero entero");
        num = leer.nextInt();
        
        while (num>9){
            num = num/10;
            cont++;
        }
        
        System.out.println("La cantidad de digitos del numero es de: " +cont);
    }
    
}
