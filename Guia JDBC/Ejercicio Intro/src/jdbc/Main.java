package jdbc;

import jdbc.entidades.Usuario;
import jdbc.servicios.UsuarioService;

public class Main {

    public static void main(String[] args) {
        
        UsuarioService usuarioService = new UsuarioService();
        
        try {
            
            usuarioService.mostrarTodos();

//            System.out.println("============================");
//
//            usuarioService.crearUsuario("879", "juan", "juan@gmail.com", 20);
//            
//            usuarioService.mostrarTodos();           
//            
//            System.out.println("============================");
//            
//            Usuario u = usuarioService.buscarPorCorreoElectronico("juan@gmail.com");
//            
//            if (u == null) {
//                System.out.println("No se encotró ningún usuario con ese correo");
//            } else {
//                System.out.println(u);
//            }
//
//            usuarioService.eliminarUsuario("juan@gmail.com");
//            
//            System.out.println("============================");
//            
//            usuarioService.mostrarTodos();

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        
    }
    
}
