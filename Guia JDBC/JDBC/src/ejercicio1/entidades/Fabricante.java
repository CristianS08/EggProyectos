
package ejercicio1.entidades;

public class Fabricante {
    private int condigo;
    private String nombre;

    public Fabricante(int condigo, String nombre) {
        this.condigo = condigo;
        this.nombre = nombre;
    }

    public Fabricante() {
    }

    public int getCondigo() {
        return condigo;
    }

    public void setCondigo(int condigo) {
        this.condigo = condigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Fabricante{" + "condigo=" + condigo + ", nombre=" + nombre + '}';
    }
    
    
}
