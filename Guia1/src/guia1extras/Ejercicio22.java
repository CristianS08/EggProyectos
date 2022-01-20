
package guia1extras;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String [][] m = new String [20][20];
        String palabra;
        int index;
        
        do{
        System.out.println("Ingrese una palabra que contenga entre 3-5 caracteres para agregar a la sopa");
        palabra= leer.next();
        
        if (palabra.length()<3 || palabra.length()>5){
            System.out.println("Tamaño de palabra incorrecta");
        }
        
        } while(palabra.length()<3 || palabra.length()>5);
        
        index= (int)(Math.random()*21);
        
        
    }
    
}
