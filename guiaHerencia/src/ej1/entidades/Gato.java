
package ej1.entidades;

public class Gato extends Animal{

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("Soy un gato, mi nombre es "+ nombre+ " y me alimento de "+ alimento);
    }
    
    
    
}
