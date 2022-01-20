
package ej1.entidades;

public class Caballo extends Animal{

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("Soy un caballo, mi nombre es "+ nombre+" y me alimento de "+ alimento);
    }
    
    
}
