
package ej4.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej4Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        int numeroAdivinado = (int) (Math.random() * 500 + 1);
        int numeroIngresado;
        boolean flag = false;
        
        
        System.out.println(numeroAdivinado);
        int contador=1;
        try{
            System.out.println("Intente adivinar el numero generado");
            System.out.println("Este numero se encuentra entre 1 y 500");
            numeroIngresado = input.nextInt(); 
            
        do{
            if(numeroIngresado==numeroAdivinado){
                flag=true;
            }else if(numeroIngresado<numeroAdivinado){
                System.out.println("El numero a adivinar es mayor al numero ingresado, intente nuevamente");
                numeroIngresado = input.nextInt();
                contador++;
            }else if(numeroIngresado>numeroAdivinado){
                System.out.println("El numero a adivinar es menor al numero ingresado, intente nuevamente");
                numeroIngresado = input.nextInt();
                contador++;
            }
            
        }while(!flag);
        
        System.out.println("Acertaste en el intento n°"+contador+ "\nEl numero aleatorio es: "+ numeroAdivinado);
        } catch(InputMismatchException e){
            System.out.println("Error, se ingresado un tipo de dato no esperado");
            System.out.println(e.getMessage());
        } finally{
            if (!flag){
                System.out.println("Perdiste en el intento n°"+ (contador+1));
            }
        } 
        
    }
    
}
