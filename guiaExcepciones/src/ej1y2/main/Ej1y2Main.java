
package ej1y2.main;

import ej1y2.entidades.Prueba;
import java.util.ArrayList;

public class Ej1y2Main {

    public static void main(String[] args) {
        
        ArrayList<String> nombres = new ArrayList();
        nombres.add("Cristian");
        nombres.add("Gonzalo");
        nombres.add("Maria");
        
        try{
            Prueba p = null;
            p.getAtributo();
            String nombre = nombres.get(4);
        } catch (NullPointerException e){
            System.out.println("Objeto no inicializado");
            System.out.println(e.toString());
        } catch (IndexOutOfBoundsException e){
            System.out.println("Error en el indice apuntado en el arreglo");
            System.out.println(e.getMessage());
        }
        
    }
    
}
