
package ejercicio5.main;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

public class Ej5 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in).useDelimiter("\n");
        
        String meses[] = new String[12];
        int indice = (int) (Math.random()*12);
        
        
        meses[0] = "enero";
        meses[1] = "febrero";
        meses[2] = "marzo";
        meses[3] = "abril";
        meses[4] = "mayo";
        meses[5] = "junio";
        meses[6] = "julio";
        meses[7] = "agosto";
        meses[8] = "septiembre";
        meses[9] = "octubre";
        meses[10] = "noviembre";
        meses[11] = "diciembre";
        
        String mesSecreto = meses[indice];
        
        String rta;
        boolean bandera=true;
        do{
            System.out.println("Adivine el mes secreto");
            rta=imput.next();
            rta = toLowerCase(rta);
            if(mesSecreto.equals(rta)){
                bandera = false;
            } else{
                System.out.println("Mes incorrecto, intente nuevamente");
            }
        }while(bandera==true);
        
        System.out.println("Lo has encontrado! El mes secreto es "+ mesSecreto);
    }
    
}
