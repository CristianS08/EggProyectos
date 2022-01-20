
package guia1;

import java.util.Scanner;

public class Ejercicio28 {

 
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        int[][] m = new int[10][10];
        int[][] m1 = new int[3][3];
        int i, j, posf=0, posc=0;
        boolean bandera= false;

        // Lleno matriz 10x10
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                m[i][j] = (int) (Math.random() * 10);
            }
        }

        // Muestro matriz 10x10
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print("[" + m[i][j] + "]");
            }
            System.out.println("");
        }

        // Lleno matriz 3x3
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Ingrese el elemento ["+i+","+j+"]");
                m1[i][j] = leer.nextInt();
            }
        }
        
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 7; j++) {
                if (m[i][j]== m1[0][0]){
                    if ((m[i][j+1]== m1[0][1]) && (m[i][j+2]== m1[0][2])){
                        if ((m[i+1][j]== m1[1][0]) && (m[i+1][j+1]== m1[1][1]) && (m[i+1][j+2]== m1[1][2])){
                            if ((m[i+2][j]== m1[2][0]) && (m[i+2][j+1]== m1[2][1]) && (m[i+2][j+2]== m1[2][2])){
                                bandera= true;
                                posc=i;
                                posf=j;
                            }
                        }
                    }
                }
            }
        }
        
        
        if (bandera==true){
            System.out.println("Se encontro la matriz de 3x3 dentro de la matriz de 10x10 con su posicion [0,0] iniciando en la posicion ["+posc+","+posf+"]");
        } else{
            System.out.println("No se encontro la matriz de 3x3 dentro de la matriz de 10x10");
        }
        
        
    }
    
}
