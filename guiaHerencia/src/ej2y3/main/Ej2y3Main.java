
package ej2y3.main;

import ej2y3.entidades.Electrodomestico;
import ej2y3.entidades.Lavadora;
import ej2y3.entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej2y3Main {

    
    public static void main(String[] args) {
        
        ArrayList <Electrodomestico> electrodomesticos = new ArrayList();
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        boolean bandera = true;
        String rtaElec, rta;
        do{
            System.out.println("¿Que electrodomestico tiene?(lavadora, televisor)");
            rtaElec = input.next();
            if(rtaElec.toLowerCase().equals("lavadora")){
                Lavadora lav = new Lavadora();
                lav.crearLavadora();
                electrodomesticos.add(lav);
            } else if(rtaElec.toLowerCase().equals("televisor")){
                Televisor tv = new Televisor();
                tv.crearTelevisor();
                electrodomesticos.add(tv);
            } else{
                System.out.println("Se ha ingresado un electrodomestico incorrecto");
            }
            
            System.out.println("\n¿Tiene otro electrodomestico?(S/N)\n");
            rta = input.next();
            
            if(rta.toUpperCase().equals("N")){
                bandera = false;
            }
            
        } while(bandera);
        
        System.out.println("---------------");
        
        float precioTotal = 0;
        float precioLavadoras = 0;
        float precioTvs = 0;
        
        for (Electrodomestico elec : electrodomesticos) {
            float precioFinal = elec.precioFinal();
            precioTotal += precioFinal;
            
            if(elec instanceof Lavadora){
                precioLavadoras += precioFinal;
                
                System.out.println("Lavadora: $"+ precioFinal);
            } else if(elec instanceof Televisor){
                precioTvs += precioFinal;
                
                System.out.println("Televisor: $"+ precioFinal);
            }
        }
        
        System.out.println("\nTotal lavadoras: $"+ precioLavadoras);
        System.out.println("Total Televisores: $"+ precioTvs);
        System.out.println("\nTotal: $"+ precioTotal);
    }
    
}
