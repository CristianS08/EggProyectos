
package ej3.servicio;

import ej3.entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CartasServicios {
    
    private Scanner imput;
    private ArrayList<Carta> baraja;
    private ArrayList<Carta> barajaResto;

    public CartasServicios() {
        imput = new Scanner(System.in).useDelimiter("\n");
        baraja = new ArrayList();
        barajaResto = new ArrayList();
    }
    
    public void crearBaraja(){
        Carta carta1 = new Carta(1,"espada");  baraja.add(carta1);
        Carta carta2 = new Carta(2,"espada");baraja.add(carta2);
        Carta carta3 = new Carta(3,"espada");baraja.add(carta3);
        Carta carta4 = new Carta(4,"espada");baraja.add(carta4);
        Carta carta5 = new Carta(5,"espada");baraja.add(carta5);
        Carta carta6 = new Carta(6,"espada");baraja.add(carta6);
        Carta carta7 = new Carta(7,"espada");baraja.add(carta7);
        Carta carta8 = new Carta(10,"espada");baraja.add(carta8);
        Carta carta9 = new Carta(11,"espada");baraja.add(carta9);
        Carta carta10 = new Carta(12,"espada");baraja.add(carta10);
        Carta carta11 = new Carta(1,"basto");baraja.add(carta11);
        Carta carta12 = new Carta(2,"basto");baraja.add(carta12);
        Carta carta13 = new Carta(3,"basto");baraja.add(carta13);
        Carta carta14 = new Carta(4,"basto");baraja.add(carta14);
        Carta carta15 = new Carta(5,"basto");baraja.add(carta15);
        Carta carta16 = new Carta(6,"basto");baraja.add(carta16);
        Carta carta17 = new Carta(7,"basto");baraja.add(carta17);
        Carta carta18 = new Carta(10,"basto");baraja.add(carta18);
        Carta carta19 = new Carta(11,"basto");baraja.add(carta19);
        Carta carta20 = new Carta(12,"basto");baraja.add(carta20);
        Carta carta21 = new Carta(1,"copa");baraja.add(carta21);
        Carta carta22 = new Carta(2,"copa");baraja.add(carta22);
        Carta carta23 = new Carta(3,"copa");baraja.add(carta23);
        Carta carta24 = new Carta(4,"copa");baraja.add(carta24);
        Carta carta25 = new Carta(5,"copa");baraja.add(carta25);
        Carta carta26 = new Carta(6,"copa");baraja.add(carta26);
        Carta carta27 = new Carta(7,"copa");baraja.add(carta27);
        Carta carta28 = new Carta(10,"copa");baraja.add(carta28);
        Carta carta29 = new Carta(11,"copa");baraja.add(carta29);
        Carta carta30 = new Carta(12,"copa");baraja.add(carta30);
        Carta carta31 = new Carta(1,"oro");baraja.add(carta31);
        Carta carta32 = new Carta(2,"oro");baraja.add(carta32);
        Carta carta33 = new Carta(3,"oro");baraja.add(carta33);
        Carta carta34 = new Carta(4,"oro");baraja.add(carta34);
        Carta carta35 = new Carta(5,"oro");baraja.add(carta35);
        Carta carta36 = new Carta(6,"oro");baraja.add(carta36);
        Carta carta37 = new Carta(7,"oro");baraja.add(carta37);
        Carta carta38 = new Carta(10,"oro");baraja.add(carta38);
        Carta carta39 = new Carta(11,"oro");baraja.add(carta39);
        Carta carta40 = new Carta(12,"oro");baraja.add(carta40);
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }
    
    
    
    
    public void barajar(){
        Collections.shuffle(baraja);
    }
    
    public void siguienteCarta(){
        Carta carta = baraja.get(0);
        System.out.println(carta);
        
        barajaResto.add(carta);
                
        baraja.remove(0);
    }
    
    public void darCartas(int cant){
        for(int i=0; i<cant ; i++){
            Carta carta = baraja.get(i);
            System.out.println(carta);
            barajaResto.add(carta);
            baraja.remove(i);
        }
    }
    
    public void cartasDisponibles(){
        for (Carta carta : baraja) {
            System.out.println(carta);
        }
    }
    
    public void mostrarCartasQueHanSalido(){
        for (Carta carta : barajaResto) {
            System.out.println(carta);
        }
    }
    
    public void mostrarBaraja(){
        for (Carta carta : baraja) {
            System.out.println(carta);
        }
        for (Carta carta : barajaResto) {
            System.out.println(carta);
        }
    }
    
    
    
    
}
