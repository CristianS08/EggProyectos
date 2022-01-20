
package guia1;
import java.util.Scanner;

public class Ejercicio20 {

 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int a, b, c, d, i;
        
        System.out.println("Ingrese 4 numeros enteros");
        a=leer.nextInt();
        b=leer.nextInt();
        c=leer.nextInt();
        d=leer.nextInt();
        
        for (i=0;i<a;i++){
            if (i==0){
                System.out.print(a+" *");
            } else{
                System.out.print("*");
            }
            
        }
        System.out.println("");
        
        for (i=0;i<b;i++){
            if (i==0){
                System.out.print(b+" *");
            } else{
                System.out.print("*");
            }
            
        }
        System.out.println("");
        
        for (i=0;i<c;i++){
            if (i==0){
                System.out.print(c+" *");
            } else{
                System.out.print("*");
            }
            
        }
        System.out.println("");
        
        for (i=0;i<d;i++){
            if (i==0){
                System.out.print(d+" *");
            } else{
                System.out.print("*");
            }
            
        }
        System.out.println("");
    }
    
}
