
package guia1;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        /* Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse*/
        
        Scanner leer = new Scanner(System.in);
        
        float num=0, suma;
        int i;
        
        suma=0;
        for(i=0;i<=19;i++){
            System.out.println("Ingrese un numero ");
            num=leer.nextFloat();
            
            if (num==0){
                break;
            }else{
                if (num>0){
                    suma = suma+num;
                }
            }
        }
        if (num==0){
            System.out.println("Se capturo el numero cero");
            System.out.println("La suma es: "+suma);
        }else{
            System.out.println("La suma de los numeros es: "+suma);
        }
    }
    
}
