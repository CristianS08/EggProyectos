
package ej2y3.entidades;

public class Televisor extends Electrodomestico {
    private float resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
        super();
    }

    public Televisor(float resolucion, boolean sintonizdorTDT, float precio, String color, String consumoEnergetico, float peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizdorTDT;
    }

    public float getResolucion() {
        return resolucion;
    }

    public void setResolucion(float resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizdorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizdorTDT(boolean sintonizdorTDT) {
        this.sintonizadorTDT = sintonizdorTDT;
    }

    @Override
    public String toString() {
        
        return "Televisor{" +super.toString()+ ",resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }
    
    
    
    
    public Televisor crearTelevisor(){
        System.out.println("Ingrese los datos del televisor\n");
        super.crearElectrodomestico();
        
        System.out.println("Ingrese la resolucion del tv");
        resolucion = input.nextFloat();
        
        System.out.println("¿Tiene sintonizador TDT?(S/N)");
        String rta = input.next();
        if(rta.equals("S")){
            sintonizadorTDT = true;
        } else{
            sintonizadorTDT = false;
        }
        
        return new Televisor(resolucion, sintonizadorTDT, precio, color, consumoEnergetico, peso);
    }

    @Override
    public float precioFinal() {
        float precioFinal = super.precioFinal();

        if(sintonizadorTDT){
            precioFinal +=500;
        }
        
        if(resolucion>40){
            precioFinal +=(precioFinal*0.3);
        }
        
        return precioFinal;
    }
    
    
    
    
}
