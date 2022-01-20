
package guia1;
import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        double euro;
        String moneda;
        
        System.out.println("Ingrese la cantidad de euros que desea convertir");
        euro= leer.nextFloat();
        
        System.out.println("¿A que moneda desea convertirlo? (libras / pesos / yenes)");
        moneda = leer.next();
        
        moneda= moneda.toLowerCase();
        
        convertirDinero(euro, moneda);
    }
    
    public static void convertirDinero(double euro, String moneda){
        switch (moneda) {
            case "libras": euro= euro*0.86;
                        System.out.println("La cantidad de euros ingresada son: "+ euro +" libras"); break;
            case "pesos": euro= euro* 1.28611;
                        System.out.println("La cantidad de euros ingresada son: "+ euro +" pesos"); break;
            case "yenes": euro= euro* 129.852;
                        System.out.println("La cantidad de euros ingresada son: "+ euro +" yenes"); break;
            
                
                
        }

}
    
}


