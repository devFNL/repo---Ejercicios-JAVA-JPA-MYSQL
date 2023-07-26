/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmascota.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import testmascota.dominio.usuario.Usuario;

/**
 *
 * @author Jib
 */
public final class UsuarioDAO extends DAO {

    public void guardarUsuario(Usuario usuario) throws Exception {
        try {
            if (usuario == null) {
                throw new Exception("Debe indicar el usuario");
            }

            String sql = "INSERT INTO usuarios (correoElectronico, clave)"
                    + "VALUES ( '" + usuario.getCorreoElectronico() + "' , '" + usuario.getClave() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarUsuario(Usuario usuario) throws Exception {
        try {
            if (usuario == null) {
                throw new Exception("Debe indicar el usuario que desea modificar");
            }

            String sql = "UPDATE usuarios SET "
                    + "clave = '" + usuario.getClave() + "' WHERE correoElectronico = '" + usuario.getCorreoElectronico() + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarUsuario(String correEletronico) throws Exception {
        try {

            String sql = "DELETE FROM usuarios WHERE correoElectronico = '" + correEletronico + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Usuario buscarUsuarioPorCorreoElectronico(String correoElectronico) throws Exception {
        try {

            String sql = "SELECT * FROM usuarios "
                    + " WHERE correoElectronico = '" + correoElectronico + "'";

            consultarBase(sql);

            Usuario usuario = null;
            while (resultado.next()) {
                usuario = new Usuario();
                usuario.setId(resultado.getInt(1));
                usuario.setCorreoElectronico(resultado.getString(2));
                usuario.setClave(resultado.getString(3));
            }
            desconectarBase();
            return usuario;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Usuario buscarUsuarioPorId(Integer id) throws Exception {
        try {

            String sql = "SELECT * FROM usuarios "
                    + " WHERE id = '" + id + "'";

            consultarBase(sql);

            Usuario usuario = null;
            while (resultado.next()) {
                usuario = new Usuario();
                usuario.setId(resultado.getInt(1));
                usuario.setCorreoElectronico(resultado.getString(2));
                usuario.setClave(resultado.getString(3));
            }
            desconectarBase();
            return usuario;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Usuario> listarUsuarios() throws Exception {
        try {
            String sql = "SELECT correoElectronico, clave FROM usuarios ";

            consultarBase(sql);

            Usuario usuario = null;
            Collection<Usuario> usuarios = new ArrayList();
            while (resultado.next()) {
                usuario = new Usuario();
                usuario.setCorreoElectronico(resultado.getString(1));
                usuario.setClave(resultado.getString(2));
                usuarios.add(usuario);
            }
            desconectarBase();
            return usuarios;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}
