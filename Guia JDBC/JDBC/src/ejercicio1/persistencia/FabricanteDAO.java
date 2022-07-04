
package ejercicio1.persistencia;

import ejercicio1.entidades.Fabricante;

public class FabricanteDAO extends DAO{
    
    public void crearFabricante (Fabricante fabricante) throws Exception{
        
        try {
            
            String sql = "INSERT INTO fabricante VALUES(" + fabricante.getCondigo() + ", '" +fabricante.getNombre()+"')";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public Fabricante buscarPorCodico (int codigo) throws Exception{
        
        try {
            
            String sql = "SELECT * FROM fabricante WHERE codigo = "+ codigo;
            
            consultarBase(sql);
            
            Fabricante f = null;
            
            while(resultado.next()){
                f = new Fabricante();
                f.setCondigo(resultado.getInt(1));
                f.setNombre(resultado.getString(2));
            }
            
            return f;
            
        } catch (Exception e) {
            throw e;
        } finally{
            desconectarBase();
        }
    }
}
