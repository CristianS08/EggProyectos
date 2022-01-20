
package ejercicio6.servicios;

import ejercicio6.entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicios {
    Scanner imput = new Scanner(System.in).useDelimiter("\n");
    
    public Ahorcado crearJuego(){
        System.out.println("Ingrese la palabra"); 
        String palabra = imput.next();
        System.out.println("Cantidad de jugadas maximas");
        int cantJugadasMax = imput.nextInt();
        
        String buscar[] = new String[palabra.length()];
        
        for(int i=0;i<palabra.length();i++){
            buscar[i]=palabra.substring(i, i+1);
        }
        
        return new Ahorcado(0,cantJugadasMax,buscar);        
    }
    
    public void longitud(Ahorcado ahorcado){
        System.out.println("La palabra que debes encontrar tiene una longitud de "+ ahorcado.getBuscar().length+" letras");
    }
    
    public void buscar(Ahorcado ahorcado, String letra){
        int cont=0;
        for(int i=0; i<ahorcado.getBuscar().length;i++){
            if(ahorcado.getBuscar()[i].equals(letra)){
                cont++;
            }
        }
        if(cont==0){
            System.out.println("La letra ingresada no se encuentra");
        } else{
            System.out.println("La letra ingresada se encuentra en la palabra");
        }
    }
    
    public void encontradas(Ahorcado ahorcado, String letra){
        int cont=0;
        for(int i=0; i<ahorcado.getBuscar().length;i++){
            if(ahorcado.getBuscar()[i].equals(letra)){
                cont++;
            }
        }
        if (cont==0){
            ahorcado.setCantJugadasMax(ahorcado.getCantJugadasMax()-1);
        } else{
            System.out.println("Se han encontrado "+ cont+" letras");
            ahorcado.setCantLetrasEncontradas(ahorcado.getCantLetrasEncontradas()+cont);
            System.out.println("Faltan "+(ahorcado.getBuscar().length-ahorcado.getCantLetrasEncontradas())+" letras por encontrar");
        }
    }
    
    public void mostrarCantIntentos(Ahorcado ahorcado){
        System.out.println("Le quedan "+ahorcado.getCantJugadasMax()+" jugadas");
    }
    
    
    
}
