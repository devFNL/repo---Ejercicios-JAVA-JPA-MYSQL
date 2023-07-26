/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Cliente;

/**
 *
 * @author Jib
 */
public class ClienteDAO extends DAO<Cliente> {

    @Override
    public void eliminar(Cliente objeto) {
        super.eliminar(objeto); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Cliente objeto) {
        super.editar(objeto); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(Cliente objeto) {
        super.guardar(objeto); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Cliente> listarClientes() {

        conectar();

        List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c").getResultList();
        desconectar();
        return clientes;

    }

}
