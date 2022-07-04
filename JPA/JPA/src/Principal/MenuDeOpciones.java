
package Principal;

import java.util.Scanner;
import java.util.UUID;

public class MenuDeOpciones {
    
    private Scanner input;
    private int opc;

    public MenuDeOpciones() {
        Scanner input = new Scanner(System.in).useDelimiter("\n"); 
        opc = 0;
    }
    
    public void correr(){
        
        do{
            System.out.println("Bienvenido\n");
            System.out.println("¿Que desea hacer?\n");
            System.out.println("1: Agregar un libro");
            System.out.println("2: Eliminar un libro");
            System.out.println("3: Editar un libro");
            System.out.println("4: Buscar un libro por ISBN");
            System.out.println("5: Buscar un libro por titulo");
            System.out.println("6: Buscar libro/s por el nombre del autor");
            System.out.println("7: Buscar libro/s por el nombre de la editorial\n");
            
            opc = input.nextInt();
        } while(opc>0 & opc<7);
        
        switch(opc){
        }
    }
    
    public void solicitarDatosLibro(){
        System.out.println("Ingrese datos del Libro");
        
        System.out.println("ISBN: ");
        String isbn = input.next();
        
        System.out.println("Tiulo: ");
        String titulo = input.next();
        
        System.out.println("Año: \n");
        
    }
    
    public void solicitarDatosAutor(){
        System.out.println("Ingrese los datos del Autor");
        
        System.out.println("Nombre: \n");
        String nombre = input.next();
        
        String id = UUID.randomUUID().toString();
    }
    
    public void solicitarDatosEditorial(){
        System.out.println("Ingrese los datos de la Editorial");
        
        System.out.println("Nombre: \n");
        
        String id = UUID.randomUUID().toString();
        
    }
    
    
    
}
