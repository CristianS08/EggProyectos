
package guia1;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        /* Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
carácter tiene que ser X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas*/
        
        Scanner leer=new Scanner(System.in);
        
        int correctas=0, incorrectas=0, i, longitud;
        String cadena, letra, fde="&&&&&";
        boolean bandera=true;
        
        do{
            System.out.println("Ingrese la cadena a leer");
            cadena= leer.nextLine();
            cadena=cadena.toLowerCase();
            
            longitud= cadena.length();
                
            if (cadena.equals(fde)){
                bandera=false;
            }else{
                if(longitud<=5 && "x".equals(cadena.substring(0, 1)) && "o".equals(cadena.substring(longitud-1, longitud))){
                    correctas++;
                }else{
                    incorrectas++;   
                }
            }
        }while(bandera==true);
        
        System.out.println("La cantidad de cadenas correctas es de: "+ correctas);
        System.out.println("La cantidad de cadenas incorrectas es de: "+ incorrectas);
    }
    
}
