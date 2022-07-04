
package ejercicio1.servicios;

import ejercicio1.entidades.Fabricante;
import ejercicio1.persistencia.FabricanteDAO;

public class FabricanteServicio {
    
    FabricanteDAO dao;
    
    public FabricanteServicio(){
        dao = new FabricanteDAO();
    }
    
    public void crearFabricante(int codigo, String nombre) throws Exception{
        
        validar(codigo, nombre);
        
        Fabricante f = new Fabricante(codigo, nombre);
        
        dao.crearFabricante(f);
        
        System.out.println("Se agrego correctamente el fabricante.");
    }
    
    public Fabricante buscarPorCodigo(int codigo) throws Exception{
        return dao.buscarPorCodico(codigo);
    }
    
    public void validar(int codigo, String nombre) throws Exception{
        
        if(codigo<0){
            throw new Exception("Codigo incorrecto.");
        }
        
        if(nombre.trim().isEmpty() || nombre==null){
            throw new Exception("Debe indicar un nombre");
        }
        
        Fabricante f = buscarPorCodigo(codigo);
        
        if(f != null){
            throw new Exception("Ya existe un fabricante con ese codigo "+codigo);
        }
    }
}
