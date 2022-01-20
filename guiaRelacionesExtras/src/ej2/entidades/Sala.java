
package ej2.entidades;

import java.util.HashSet;

public class Sala {
    private String [][] espacio = new String[8][6];
    private HashSet<Espectador> espectadores = new HashSet();
    private Pelicula pelicula;

    public Sala(HashSet<Espectador> espectadores, Pelicula pelicula) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                espacio[i][j] = " ";
            }
        }
        
        this.espectadores = espectadores;
        this.pelicula = pelicula;
    }

    public String[][] getEspacio() {
        return espacio;
    }

    public void setEspacio(String[][] espacio) {
        this.espacio = espacio;
    }

    public HashSet<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(HashSet<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Sala{" + "espacio=" + espacio + ", espectadores=" + espectadores + ", pelicula=" + pelicula + '}';
    }
    
    
    
}
