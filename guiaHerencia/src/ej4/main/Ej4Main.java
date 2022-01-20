
package ej4.main;

import ej4.entidades.Circulo;
import ej4.entidades.Rectangulo;
import java.util.Scanner;

public class Ej4Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el radio del circulo");
        float radio = input.nextFloat();
        
        Circulo circulo = new Circulo(radio);
        
        System.out.println("El area del circulo es: "+ circulo.area());
        
        System.out.println("El perimetro del circulo es: "+ circulo.preimetro());
        
        System.out.println("\nIngrese la base del rectangulo");
        float base = input.nextFloat();
        
        System.out.println("Ingrese la altura del rectangulo");
        float altura = input.nextFloat();
        
        Rectangulo rec = new Rectangulo(base, altura);
        
        System.out.println("El area del rectangulo es: "+ rec.area());
        
        System.out.println("El perimetro del rectangulo es: "+ rec.preimetro());
        
    }
    
}
