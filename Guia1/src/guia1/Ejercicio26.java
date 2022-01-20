
package guia1;

import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int i,j;
        int [][] m= new int [3][3];
        int [][] m2= new int [3][3];
        boolean bandera=true;
        
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println("Ingrese el elemento ["+i+","+j+"]");
                m[i][j]= leer.nextInt();
                m2[i][j]= m[i][j];

            }
        }
        
        System.out.println("Matriz original:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print("["+m[i][j]+"]");
            }
            System.out.println("");
        }
        
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                m[i][j]= m2[j][i];

            }
        }
        
        System.out.println("\n");
        
        System.out.println("Matriz trnspuesta:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print("["+m[i][j]+"]");
            }
            System.out.println("");
        }
        
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(m[i][j]!= -m2[i][j]){
                    bandera=false;
                } else if ((i==j) && (m[i][j]!=0)){
                    bandera=false;
                }
            }
        }
        
        System.out.println("\n");
        
        if (bandera==true){
            System.out.println("La matriz es una matriz antisimetrica");
        } else{
            System.out.println("La matriz no es una matriz antisimetrica");
        }
    }
    
}
