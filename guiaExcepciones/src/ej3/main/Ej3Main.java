
package ej3.main;

import ej3.entidades.DivisionNumero;
import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        DivisionNumero dn;
        
        int num1;
        int num2;
        
        try{
            System.out.println("Ingrese un numero(con letras)");
            String numero1 = input.next();
        
            System.out.println("Ingrese otro numero(con letras)");
            String numero2 = input.next();
        
            dn = new DivisionNumero(numero1, numero2);
        
            num1 = Integer.parseInt(dn.getNum1());
            num2 = Integer.parseInt(dn.getNum2());
        
            System.out.println("La division de los numeros es: "+ (num1/num2));
        } catch(InputMismatchException e){
            System.out.println("Error, se ha ingresado un tipo de dato no esperado");
            System.out.println(e.getMessage());
        } catch(NumberFormatException e){
            System.out.println("La cadena no puede comvertirse en numero");
            System.out.println(e.getMessage());
        } catch(ArithmeticException e){
            System.out.println("No es posible dividir un numero por cero");
            System.out.println(e.getMessage());
        }
        
    }
    
}
