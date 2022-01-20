
package guia1extras;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        float i1, i2, tp1, tp2, prom, contA=0, contD=0;
        float [] notas= new float[10];
        
        for(int i=0;i<10;i++){
            System.out.println("Notas del alumno "+ (i+1));
            
            System.out.println("Ingrese la nota del TP N°1");
            tp1= leer.nextFloat();
            
            System.out.println("Ingrese la nota del TP N°2");
            tp2= leer.nextFloat();
            
            System.out.println("Ingrese la nota del integrador 1");
            i1= leer.nextFloat();
            
            System.out.println("Ingrese la nota del integrador 2");
            i2= leer.nextFloat();

            prom = (float) ((tp1*0.1)+(tp2*0.15)+(i1*0.25)+(i2*0.5));
            
            notas[i]= prom;
        }
        
        for(int i=0;i<10;i++){
            if (notas[i]<7){
                contD++;
            } else{
                contA++;
            }
        }
        
        System.out.println("Han aprobado "+ contA+" alumnos");
        System.out.println("Y desaprobaron "+ contD+ "alumnos");
    }
    
}
