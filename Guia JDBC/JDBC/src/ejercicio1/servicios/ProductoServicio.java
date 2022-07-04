
package ejercicio1.servicios;

import ejercicio1.entidades.Fabricante;
import ejercicio1.entidades.Producto;
import ejercicio1.persistencia.ProductoDAO;
import java.util.List;

public class ProductoServicio {
    
    private final ProductoDAO dao;
    private final FabricanteServicio fabricanteServicio;
    
    public ProductoServicio(){
        dao = new ProductoDAO();
        fabricanteServicio = new FabricanteServicio();
    }
    
    public void crearProducto(int codigo, String nombre, double precio, int codigoFabricante) throws Exception{
        
        Fabricante f = fabricanteServicio.buscarPorCodigo(codigoFabricante);
        
        Producto p = new Producto(codigo, nombre, precio, f);
        
        dao.crearProducto(p);
        
        System.out.println("Se agrego un produto correctamente.");
    }
    
    public List<Producto> listarProductos() throws Exception{
        return dao.listarProductos();
    }
    
    public void mostrarNombres() throws Exception{
        
        List<Producto> productos = listarProductos();
        
        System.out.println("Los productos en lista son: \n");
        
        for (Producto producto : productos) {
            System.out.println(producto.getNombre());
        }
    }
}
