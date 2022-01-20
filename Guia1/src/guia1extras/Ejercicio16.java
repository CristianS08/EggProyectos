
package guia1extras;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        int n;
        boolean resultado;
        
        System.out.println("Ingrese un numero");
        n= leer.nextInt();
        
        resultado= esPrimo(n);
        
        if(resultado== true){
        System.out.println("El numero es primo ");
        }else {
            System.out.println("El numero no es primo");
        }
        
    }
    
    public static boolean esPrimo(int num){
        boolean rta= true;
        
        for(int i=2;i<num;i++){
            if (num%i==0){
                rta=false;
            }
        }
        
        return rta;
    }
    
}
