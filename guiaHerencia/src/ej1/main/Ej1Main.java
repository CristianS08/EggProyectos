
package ej1.main;

import ej1.entidades.Animal;
import ej1.entidades.Caballo;
import ej1.entidades.Gato;
import ej1.entidades.Perro;

public class Ej1Main {

    public static void main(String[] args) {
        
        Animal perro1 = new Perro("Stich", "carne", 15, "Dobberman");
        perro1.alimentarse();
        
        Animal perro2 = new Perro("Teddy", "croquetas", 10, "Chihuahua");
        perro2.alimentarse();
        
        Animal gato = new Gato("Pelusa", "galletas", 15, "Siames");
        gato.alimentarse();
        
        Animal caballo = new Caballo("Spark", "pasto", 25, "fino");
        caballo.alimentarse();
        
        
    }
    
}
