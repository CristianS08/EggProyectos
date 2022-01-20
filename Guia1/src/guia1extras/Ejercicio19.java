
package guia1extras;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        int tam;
        
        System.out.println("Ingrese el tamaño del vector");
        tam = leer.nextInt();
        
        int [] vector = new int[tam];

        
        vector= llenado(vector, tam);
        
        muestraVector(vector, tam);
        
    }
    
    public static int [] llenado(int v[], int n){
        
        for(int i=0;i<n;i++){
            v[i]= (int)(Math.random()*10);
        }
        return v;
    }
    
    public static void muestraVector(int vec[],int n){
        
        System.out.println("El vector lleno con numeros aleatorios es el siguiente: \n");
        for(int i=0;i<n;i++){
            System.out.println("["+vec[i]+"]");
        }
}
    
}
