
package persistencia;

import entidades.Autor;

public class AutorDAO extends DAO<Autor> {

    @Override
    public Autor editar(Autor objeto) {
        return super.editar(objeto); 
    }

    @Override
    public void eliminar(Autor objeto) {
        super.eliminar(objeto);
    }

    @Override
    public void guardar(Autor objeto) {
        super.guardar(objeto);
    }
    
    public Autor buscarPorNombre(String nombre){
        conectar();
        em.getTransaction().begin();
        
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE: nombre")
                .setParameter("nombre", "%"+nombre+"%").getSingleResult();
        
        em.getTransaction().commit();
        desconectar();
        
        return autor;
    }
    
    public Autor buscarPorId(String id){
        conectar();
        em.getTransaction().begin();
        
        Autor autor = (Autor) em.createQuery("SELECT a FROM Editorial a WHERE a.id LIKE: id")
                .setParameter("id", "%"+id+"%").getSingleResult();
        
        em.getTransaction().commit();
        desconectar();
        
        return autor;
    }
    
    
    
}
