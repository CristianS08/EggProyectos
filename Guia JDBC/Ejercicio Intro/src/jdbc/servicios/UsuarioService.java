package jdbc.servicios;

import java.util.List;
import jdbc.entidades.Usuario;
import jdbc.persistencia.UsuarioDAO;

public class UsuarioService {
    
    private UsuarioDAO dao;

    public UsuarioService() {
        this.dao = new UsuarioDAO();
    }
    
    public List<Usuario> listarTodos() throws Exception {
        List<Usuario> usuarios = dao.listarTodos();
        return usuarios;
    }
    
    public void mostrarTodos() throws Exception {
        List<Usuario> usuarios = listarTodos();
        
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
    
    public void crearUsuario(String clave, String nombre, String correoElectronico, int edad) throws Exception {
        
        validar(clave, nombre, correoElectronico, edad);
        
        Usuario usuario = new Usuario();
        
        usuario.setClave(clave);
        usuario.setNombre(nombre);
        usuario.setCorreoElectronico(correoElectronico);
        usuario.setEdad(edad);
        
        dao.crearUsuario(usuario);
        
    }
    
    public Usuario buscarPorCorreoElectronico(String correo) throws Exception {
        Usuario usuario = dao.buscarPorCorreoElectronico(correo);
        return usuario;
    }
    
    public void modificarUsuario(String correo, String nombre) throws Exception {
        
        Usuario u = new Usuario();
        
        u.setCorreoElectronico(correo);
        u.setNombre(nombre);
        
        dao.modificarUsuario(u);
     
    }

    public void eliminarUsuario(String correo) throws Exception {
        dao.eliminarUsuario(correo);
    }
    
    private void validar(String clave, String nombre, String correoElectronico, int edad) throws Exception {
        
        if (clave == null || clave.isEmpty()) {
            throw new Exception("Debe indicar la clave");
        }
        
        if (nombre == null || nombre.isEmpty()) {
            throw new Exception("Debe indicar el nombre");
        }
        
        if (correoElectronico == null || correoElectronico.isEmpty()) {
            throw new Exception("Debe indicar el correo electrónico");
        }
        
        if (edad <= 0 || edad >= 120) {
            throw new Exception("Edad incorrecta");
        }
        
        Usuario u = buscarPorCorreoElectronico(correoElectronico);
        
        if (u != null) {
            throw new Exception("Ya existe un usuario con ese correo");
        }
        
    }
    
}
