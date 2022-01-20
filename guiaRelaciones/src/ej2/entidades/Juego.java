
package ej2.entidades;

import java.util.ArrayList;
import java.util.Scanner;


public class Juego {
    
    Scanner imput;
    ArrayList<Jugador> jugadores;

    public Juego() {
        imput= new Scanner(System.in).useDelimiter("\n");
        jugadores = new ArrayList();
    }
    
    
    Revolver revolver = new Revolver();
    
    public void llenarJuego(){
        revolver.llenarRevolver();
        
        System.out.println("Ingrese la cantidad de jugadores");
        int cant = imput.nextInt();
        
        if(cant<1 || cant>6){
            cant = 6;
        }
        
        for (int i = 1; i <= cant; i++) {
            Jugador jugador = new Jugador(i);
            jugadores.add(jugador);
        }
    }
    
    public String ronda(){
        
        boolean rta = false;
        
        String nombre = "";
        do{
            for (Jugador  aux : jugadores) {
                aux.disparo(revolver);
                System.out.println(aux.isMojado());
                if(aux.isMojado()){
                    rta = true;
                    nombre = aux.getNombre();
                    break;
                }
            }   
        } while(!rta);
        
        return nombre; 
    }
}
