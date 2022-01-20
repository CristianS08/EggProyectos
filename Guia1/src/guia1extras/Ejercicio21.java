
package guia1extras;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int fila, colum, suma=0;
        
        System.out.println("Ingrese la cantidad de filas de la matriz");
        fila= leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz");
        colum= leer.nextInt();
        
        int[][] m = new int[fila][colum];
        
        for(int i=0;i<fila;i++){
            for(int j=0;j<colum;j++){
                m[i][j]= (int)(Math.random()*10);
                suma+= m[i][j];
            }
        }
        
        System.out.println("La suma de todos los elementos de la matriz es: "+ suma);
    }
    
}
