
package ej1.Entidades;

public class Perro {
    
    private String nombre;
    private int edad;
    private String raza;
    private String tamaño;

    public Perro() {
    }

    public Perro(String nombre, int edad, String raza, String tamaño) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
}
