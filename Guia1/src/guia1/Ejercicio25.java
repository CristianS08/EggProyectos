
package guia1;

import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int i, j;
        
        int [][] matriz = new int[4][4];
        
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                matriz[i][j]= (int) (Math.random()*10);
            }
        }
        
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
}
