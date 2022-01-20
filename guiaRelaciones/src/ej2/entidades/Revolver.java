
package ej2.entidades;

public class Revolver {
    
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
        
    }
    
    public void llenarRevolver(){
        posicionActual = (int) (Math.random()*6+1);
        posicionAgua = (int) (Math.random()*6+1);
 
    }
    
    public boolean mojar(){
        boolean rta = false;
        
        if(posicionActual==posicionAgua){
            rta = true;
        }
        return rta;
    }
    
    public void siguienteChorro(){
        if(posicionActual<6){
        posicionActual++; 
        } else{
            posicionActual=1;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
    
}
