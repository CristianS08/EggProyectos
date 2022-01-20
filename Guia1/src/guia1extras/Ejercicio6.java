
package guia1extras;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int cant, cont=0, contM=0;
        float altura, contAltura=0, contAlturaM=0;
        
        System.out.println("Ingrese cantidad de personas");
        cant= leer.nextInt();
        
        for(int i=0;i<cant;i++){
            System.out.println("Ingrese la estatura en metros de la persona "+ (i+1));
            altura = leer.nextFloat();
            
            contAlturaM = contAlturaM+ altura;
            contM++;
            
            if(altura<=1.60){
                contAltura = contAltura + altura;
                cont++;
            }
           
        }
        
        System.out.println("\nEl promedio de altura menor a 1.60 metros es de: "+ (contAltura/cont));
        
        System.out.println("\nEl promedio general de las alturas es de: "+ (contAlturaM/contM));
    }
    
}
