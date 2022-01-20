
package ejercicio6.entidades;

public class Ahorcado {
    private int cantLetrasEncontradas;
    private int cantJugadasMax;
    private String []buscar;

    public Ahorcado() {
    }

    public Ahorcado(int cantLetrasEncontradas, int cantJugadasMax, String[] buscar) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
        this.cantJugadasMax = cantJugadasMax;
        this.buscar = buscar;
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public void setCantLetrasEncontradas(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public int getCantJugadasMax() {
        return cantJugadasMax;
    }

    public void setCantJugadasMax(int cantJugadasMax) {
        this.cantJugadasMax = cantJugadasMax;
    }

    public String[] getBuscar() {
        return buscar;
    }

    public void setBuscar(String[] buscar) {
        this.buscar = buscar;
    }
    
    
}
