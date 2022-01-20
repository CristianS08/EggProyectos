
package ej4.entidades;

public class Rectangulo implements calculoFormas{
    private float base;
    private float altura;

    public Rectangulo() {
    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    
    
    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public double preimetro() {
        return (base*altura)/2;
    }
    
    
    
}
