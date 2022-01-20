
package guia1extras;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n, i;
        
        System.out.println("Ingrese el tamaño de los vectores");
        n= leer.nextInt();
        
        int [] v1= new int[n];
        int [] v2= new int [n];
        
        for(i=0;i<n;i++){
            System.out.println("Ingrese el valor "+ (i+1)+" del vector 1");
            v1[i]= leer.nextInt();
            
            System.out.println("Ingrese el valor "+ (i+1)+" del vector 2");
            v2[i]= leer.nextInt();
            
        }
        
        for(i=0;i<n;i++){
            if(v1[i]!=v2[i]){
                break;
            }
        }
        
        if (i<(n-1)){
            System.out.println("Se encontraron elementos diferentes en la posicion "+ i);
        } else{
            System.out.println("Los vectores son iguales");
        }
        
    }
    
}
