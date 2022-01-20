
package guia1extras;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, resultado, rta;
        
        num1= (int) (Math.random()*10);
        num2= (int) (Math.random()*10);
        resultado = num1*num2;
        
        System.out.println("Adivine el resultado de una multiplicacion de dos numeros aleatorios entre 0-10\n");
        rta=leer.nextInt();
        
        if (rta==resultado){
            System.out.println("Excelente! Lo adivinaste a la primera\n");
        } else{
            do{
                System.out.println("Resultado incorrecto");
                System.out.println("Intente nuevamente\n");
                rta = leer.nextInt();
                
            } while(rta!=resultado);
            
            System.out.println("Acertaste! la respuesta correcta es: "+ resultado);
        }
        
    }
    
}
