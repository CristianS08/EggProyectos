
package servicios;

import entidades.Autor;
import persistencia.AutorDAO;

public class AutorServicios {
    
    private AutorDAO Adao;

    public AutorServicios() {
        Adao = new AutorDAO();
    }

    
    public Autor guardarAutor(String nombre, String id){
        Autor autor = new Autor(id, nombre, true);
        
        Adao.guardar(autor);
        
        return autor;
    }
    
    public void eliminarAutor(String nombre){
        
    }
}
