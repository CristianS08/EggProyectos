
package persistencia;

import entidades.Editorial;

public class EditorialDAO extends DAO<Editorial>{

    @Override
    public Editorial editar(Editorial objeto) {
        return super.editar(objeto); 
    }

    @Override
    public void eliminar(Editorial objeto) {
        super.eliminar(objeto); 
    }

    @Override
    public void guardar(Editorial objeto) {
        super.guardar(objeto);
    }
    
    public Editorial buscarPorNombre(String nombre){
        conectar();
        em.getTransaction().begin();
        
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE: nombre")
                .setParameter("nombre", "%"+nombre+"%").getSingleResult();
        
        em.getTransaction().commit();
        desconectar();
        
        return editorial;
    }
    
    public Editorial buscarPorId(String id){
        conectar();
        em.getTransaction().begin();
        
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.id LIKE: id")
                .setParameter("id", "%"+id+"%").getSingleResult();
        
        em.getTransaction().commit();
        desconectar();
        
        return editorial;
    }
}
