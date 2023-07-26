/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author Jib
 */
public class FabricanteServicio {
    
    private FabricanteDAO dao;

    public FabricanteServicio() {
        this.dao = new FabricanteDAO();
    }
    
    public void crearFabricante(String nombre) throws Exception{
        try {

            if (nombre == null || nombre.trim().isEmpty() ) {
                throw new Exception("Debe ingresar un nombre");
            }

            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(nombre);
            dao.guardarFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Fabricante buscarFabricantePorCodigo(Integer codigo) throws Exception {

        try {

            if (codigo == null) {
                throw new Exception("Debe indicar el id");
            }

            Fabricante fabricante = dao.buscarFabricantePorCodigo(codigo);

            return fabricante;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Collection<Fabricante> listarFabricantes() throws Exception {

        try {

            Collection<Fabricante> fabricantes = dao.listarFabricantes();

            return fabricantes;
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarFabricantes() throws Exception {

        try {

            Collection<Fabricante> fabricantes = listarFabricantes();

            if (fabricantes.isEmpty()) {
                throw new Exception("No existen fabricantes para mostrar");
            } else {
                for (Fabricante f : fabricantes) {
                    System.out.println(f.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    
}
