
package guia1;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int [] vector = new int[100];
        int i;
        
        for (i=0;i<=99;i++){
            vector[i]=i+1;
        }
        
        for (i=99;i>=0;i--){
            System.out.println(vector[i]);
        }
    }
    
}
