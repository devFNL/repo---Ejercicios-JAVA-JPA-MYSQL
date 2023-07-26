/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmascota.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import testmascota.dominio.mascota.Mascota;
import testmascota.dominio.usuario.Usuario;
import testmascota.dominio.usuario.UsuarioService;

/**
 *
 * @author Jib
 */
public final class MascotaDAO extends DAO {

    private final UsuarioService usuarioService;

    public MascotaDAO() {
        this.usuarioService = new UsuarioService();
    }

    public void guardarMascota(Mascota mascota) throws Exception {
        try {
            if (mascota == null) {
                throw new Exception("Debe indicar el mascota");
            }
            String sql = "INSERT INTO mascotas (apodo, raza, idUsuario) "
                    + "VALUES ( '" + mascota.getApodo() + "' , '" + mascota.getRaza() + "' ," + mascota.getUsuario().getId() + " );";

            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarMascota(Mascota mascota) throws Exception {
        try {
            if (mascota == null) {
                throw new Exception("Debe indicar el mascota que desea modificar");
            }
            String sql = "UPDATE mascotas SET "
                    + " apodo = '" + mascota.getApodo() + "' , raza = '" + mascota.getRaza() + "' , idUsuario = " + mascota.getUsuario().getId()
                    + " WHERE id = '" + mascota.getId() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarMascota(int id) throws Exception {
        try {
            String sql = "DELETE FROM mascotas WHERE id = " + id + "";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Mascota buscarMascotaPorId(int id) throws Exception {
        try {
            String sql = "SELECT * FROM mascotas WHERE id = " + id + "";
            consultarBase(sql);
            Mascota mascota = null;
            while (resultado.next()) {
                mascota = new Mascota();
                mascota.setId(resultado.getInt(1));
                mascota.setApodo(resultado.getString(2));
                mascota.setRaza(resultado.getString(3));
                Integer idUsuario = resultado.getInt(4);
                Usuario usuario = usuarioService.buscarUsuarioPorId(idUsuario);
                mascota.setUsuario(usuario);
            }
            desconectarBase();
            return mascota;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Mascota> listarMascotas() throws Exception {
        try {
            String sql = "SELECT * FROM mascotas ";
            consultarBase(sql);
            Mascota mascota = null;
            Collection<Mascota> mascotas = new ArrayList();
            while (resultado.next()) {
                mascota = new Mascota();
                mascota.setId(resultado.getInt(1));
                mascota.setApodo(resultado.getString(2));
                mascota.setRaza(resultado.getString(3));
                Integer idUsuario = resultado.getInt(4);
                Usuario usuario = usuarioService.buscarUsuarioPorId(idUsuario);
                mascota.setUsuario(usuario);
                mascotas.add(mascota);
            }
            desconectarBase();
            return mascotas;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
}
