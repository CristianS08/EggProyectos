package guia1;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        

        Scanner leer = new Scanner(System.in);

         System.out.println("Ingrese N");
        int n = leer.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println("");

        for (int j = 0; j < n - 2; j++) {
            for (int i = 0; i < n; i++) {
                if (i == 0 || i == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
                    
            System.out.println("");
        }

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println("");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*        
        int i,j, tam;
        
        System.out.println("Ingrese el tamaño del cuadrado");
        tam=leer.nextInt();
        
        for(i=1;i<=tam;i++){
            for (j=1;j<=tam;j++){
                
                if (i==1 || i==tam){
                    System.out.print("* ");
                } else if (j==1 || j==tam){
                    System.out.println("*");  
                }
            }
        }
*/
    }  
}
