
package guia1;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int i, tam, num, cont;
        
        System.out.println("Ingrese el tamaño del vector");
        tam=leer.nextInt();
        
        int [] vector = new int[tam];
        
        for (i=0;i<tam;i++){
            vector[i] = (int) (Math.random() * 10);
            
            System.out.println("["+vector[i]+"]");
        }
        
        System.out.println("Ingrese el digito que desea buscar");
            num= leer.nextInt();
        
        cont=0;
        for (i=0;i<tam;i++){
            if (vector[i]==num){
                System.out.println("Se encontro el valor buscado en la posicion: "+ i);
                cont=cont+1;
            }
        }
        if (cont==0){
            System.out.println("No se ha encontrado el numero que desea buscar");
        }
    }
}
