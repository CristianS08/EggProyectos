
package ej2.servicios;

import ej2.entidades.Cine;
import ej2.entidades.Espectador;
import ej2.entidades.Pelicula;
import ej2.entidades.Sala;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio2Servicios {
    private Scanner input;
    private HashSet<Espectador> espectadores;
    private HashSet<Sala> salas;
    private int contador;

    public Ejercicio2Servicios() {
        input = new Scanner(System.in).useDelimiter("\n");
        espectadores = new HashSet();
        salas = new HashSet();
        contador = 0;
    }
    
    
    public Cine crearCine(){
        System.out.println("Ingrese el precio de la entrada");
        float precio = input.nextFloat();
        
        return new Cine(precio,salas);
    }  
    
    public Sala crearSala(Pelicula peli){
        return new Sala(espectadores, peli);
    }
    
    public void agregarSala (Sala sala){
        salas.add(sala);
    }
    
    public Pelicula crearPelicula(){
        
        System.out.println("Ingrese el titulo de la pelicula");
        String titulo = input.next();
        System.out.println("¿Cual es la duracion de la pelicula?");
        float duracion = input.nextFloat();
        System.out.println("¿Cual es la edad minima permitida para ver la pelicula?");
        int edad = input.nextInt();
        System.out.println("Ingrese el nombre del director de la pelicula");
        String nombre = input.next();
        
        return new Pelicula(titulo,duracion,edad,nombre);
    }
    
    public Espectador crearEspectador(){
        System.out.println("Ingrese su nombre");
        String nombre = input.next();
        System.out.println("Ingrese su edad");
        int edad = input.nextInt();
        System.out.println("¿Cuanto dinero tiene?");
        float dinero = input.nextFloat();
        
        return new Espectador(nombre,edad,dinero);
    }
    
    public boolean agregarEspectador(Espectador espectador, Pelicula peli, Cine cine){
        boolean rta = false;
        if(espectador.getEdad()>=peli.getEdadMinima() && espectador.getDinero()>= cine.getPrecioEntrada() && contador<47){
            espectadores.add(espectador);
            contador++;
            rta = true;
        }   
        return rta;
    }
    
    
    public void asignarAsiento(Espectador espectador, Sala sala){
        boolean rta = false;
        int fila, columna;
        do{
            fila = (int) (Math.random()*8);
            columna = (int) (Math.random()*6);
            
            if(sala.getEspacio()[fila][columna].equals(" ")){
                sala.getEspacio()[fila][columna] = "x";
                rta = true;
            }
        } while(!rta);
    }
    
    public void mostrarSala(Sala sala){
        String columna=" ";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                switch(j){
                    case 0: columna="A"; break;
                    case 1: columna="B"; break;
                    case 2: columna="C"; break;
                    case 3: columna="D"; break;
                    case 4: columna="E"; break;
                    case 5: columna="F"; break;
                }
                System.out.print(columna+i+sala.getEspacio()[i][j]+"  ");
            }
            System.out.println("");
        }
    }
    
}
