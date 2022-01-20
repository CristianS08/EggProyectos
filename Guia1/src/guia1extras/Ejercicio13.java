
package guia1extras;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int cantF, cantH, edad, suma=0, totalH=0;
        float prom;
        
        System.out.println("Ingrese la cantidad de familias");
        cantF= leer.nextInt();
        
        
        for (int i=1;i<=cantF;i++){
            System.out.println("Cuantos hijos tiene la familia "+ i);
            cantH= leer.nextInt();
            
            totalH = totalH+cantH;
            
            for(int j=1;j<=cantH;j++){
                System.out.println("Ingrese la edad del hijo "+ j);
                edad = leer.nextInt();
                
                suma = suma+ edad;
                
            }
        }
        
        prom= (suma/totalH);
        
        System.out.println("El promedio de edad de los hijos de todas las familias es de: "+ prom);
    }
    
}
