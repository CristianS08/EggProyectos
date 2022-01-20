
package ej4.entidades;

public class Circulo implements calculoFormas {

    private float radio;
    private float diametro;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
        diametro = radio*2;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }


    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro +'}';
    }
    
    
    
    @Override
    public double area() {
        return pi*Math.pow(radio, 2);
    }

    @Override
    public double preimetro() {
        return pi+diametro;
    }

}
