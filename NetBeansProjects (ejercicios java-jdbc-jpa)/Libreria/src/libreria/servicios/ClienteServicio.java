/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import libreria.entidades.Cliente;
import libreria.persistencia.ClienteDAO;

/**
 *
 * @author Jib
 */
public class ClienteServicio {

    private final ClienteDAO DAO;

    public ClienteServicio() {
        this.DAO = new ClienteDAO();
    }

    public Cliente crearCliente(String nombre, String apellido, Long documento, String telefono) {
        Cliente cliente = new Cliente();
        try {
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setDocumento(documento);
            cliente.setTelefono(telefono);
            DAO.guardar(cliente);
            return cliente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Cliente> listarClientes() {
        try {
            return DAO.listarClientes();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
