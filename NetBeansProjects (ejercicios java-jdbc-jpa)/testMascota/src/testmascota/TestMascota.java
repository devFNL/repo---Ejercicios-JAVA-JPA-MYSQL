/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmascota;

import java.util.logging.Level;
import java.util.logging.Logger;
import testmascota.dominio.mascota.MascotaService;
import testmascota.dominio.usuario.Usuario;
import testmascota.dominio.usuario.UsuarioService;

/**
 *
 * @author Jib
 */
public class TestMascota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        UsuarioService usuarioService = new UsuarioService();
        MascotaService mascotaService = new MascotaService();

        try {
            //Creamos  usuarios
            usuarioService.crearUsuario("fiosrde@hotmail.com", "fiorde14");
            usuarioService.crearUsuario("tancho@hotmail.com", "eggprogramacion");
            usuarioService.imprimirUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }

//        try {
//            //Modificamos un usuario
//            usuarioService.modificarClaveUsuario("fiorde@hotmail.com", "fiorde14", "fiorde15");
//            usuarioService.imprimirUsuarios();
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Error del sistema por \n" + e.getMessage());
//        }
//
//        try {
//            //Eliminamos un usuario
//            usuarioService.eliminarUsuario("fiorde@hotmail.com");
//            usuarioService.imprimirUsuarios();
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Error del sistema por \n" + e.getMessage());
//        }
//
//        try {
//            //Buscamos el Usuario por correo
//            Usuario usuario = usuarioService.buscarUsuarioPorCorreoElectronico("tincho@hotmail.com");
//            //Creamos Mascota con el Usuario anterior
//            mascotaService.crearMascota("Chiquito", "Beagle", usuario);
//
//            //Mostramos Mascota con su Usuario
//            mascotaService.imprimirMascotas();
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Error del sistema por \n" + e.getMessage());
//        }

    }

}
