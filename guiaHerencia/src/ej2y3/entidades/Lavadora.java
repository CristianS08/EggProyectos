
package ej2y3.entidades;

public class Lavadora extends Electrodomestico {
    private float carga;

    public Lavadora() {
        super();
    }

    public Lavadora(float carga, float precio, String color, String consumoEnergetico, float peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        
        return "Lavadora{" +super.toString()+ " ,carga=" + carga + '}';
    }

    
    
    
    
    public Lavadora crearLavadora(){
        System.out.println("Ingrese los datos de la lavadora\n");
        super.crearElectrodomestico();
        
        System.out.println("Ingrese la cantidad de kg que soporta");
        carga = input.nextFloat();
        
        return new Lavadora(carga, precio, color, consumoEnergetico, peso);
    }
    
    @Override
    public float precioFinal(){
        float precioFinal = super.precioFinal();
        
        if (carga>30){
            precioFinal +=500;
        }
        
        return precioFinal;
    }
}
