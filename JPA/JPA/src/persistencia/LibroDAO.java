
package persistencia;

import entidades.Libro;
import java.util.List;

public class LibroDAO extends DAO<Libro>{

    @Override
    public Libro editar(Libro objeto) {
        return super.editar(objeto); 
    }

    @Override
    public void eliminar(Libro objeto) {
        super.eliminar(objeto); 
    }

    @Override
    public void guardar(Libro objeto) {
        super.guardar(objeto); 
    }
    
    public Libro buscarPorISBN(Long isbn){
        conectar();
        em.getTransaction().begin();
        
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn LIKE :isbn")
                .setParameter("isbn", isbn).getSingleResult();
        
        em.getTransaction().commit();
        desconectar();
        
        return libro;
    }
    
    public Libro buscarPorTitulo(String titulo){
        conectar();
        em.getTransaction().begin();
        
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo")
                .setParameter("titulo", titulo).getSingleResult();
        
        em.getTransaction().commit();
        desconectar();
        
        return libro;
    }
    
    public List<Libro> buscarPorAutor(String autor){
        conectar();
        em.getTransaction().begin();
        
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.autor.nombre LIKE: autor")
                .setParameter("autor", "%"+autor+"%").getResultList();
                
        em.getTransaction().commit();
        desconectar();
        
        return libros;
    }
    
    public List<Libro> buscarPorEditorial(String editorial){
        conectar();
        em.getTransaction().begin();
        
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.editorial.nombre LIKE: editorial")
                .setParameter("editorial", "%"+editorial+"%").getResultList();
        
        em.getTransaction().commit();
        desconectar();
        
        return libros;
    }
    
}
