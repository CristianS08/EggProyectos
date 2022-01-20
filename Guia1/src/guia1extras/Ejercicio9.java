
package guia1extras;

import java.util.Scanner;


public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int dividendo, divisor, cociente=0, resto;
        
        do{
            System.out.println("Ingrese el dividendo");
            dividendo= leer.nextInt();
            
            System.out.println("Ingrese el divisor");
            divisor=leer.nextInt();
           
        } while(dividendo<1 || divisor<1 || dividendo<divisor);
        
        System.out.println("La division entre "+ dividendo+"/"+divisor+" es de: \n" );
        
        while(dividendo>divisor){
            dividendo=dividendo-divisor;
            cociente++;
            
        }
        
        resto=dividendo;
        
        
        System.out.println("cociente: "+ cociente);
        System.out.println("resto: "+ resto);
    }
    
}
