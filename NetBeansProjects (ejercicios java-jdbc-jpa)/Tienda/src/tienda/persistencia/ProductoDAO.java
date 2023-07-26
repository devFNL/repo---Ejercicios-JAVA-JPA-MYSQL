/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.servicios.FabricanteServicio;

/**
 *
 * @author Jib
 */
public final class ProductoDAO extends DAO {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private final FabricanteServicio fabServ;

    public ProductoDAO() {
        this.fabServ = new FabricanteServicio();

    }

    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto;";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    // esta es la papa porque el codigo es un int, auto-increment por ende no hay que ingresarlo.
    // corregir para que pueda ingresar el nombre del fabricante y resulte en el codigo.
    public void guardarProducto(Producto producto) throws Exception {

        try {

            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }

            String sql = "INSERT INTO producto (nombre, precio, codigo_Fabricante)"
                    + "VALUES ( '" + producto.getNombre() + "' , '"
                    + producto.getPrecio() + "' , '" + producto.getCodigoFabricante() + "' );";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

//    try {
//            if (mascota == null) {
//                throw new Exception("Debe indicar el mascota que desea modificar");
//            }
//            String sql = "UPDATE mascotas SET "
//                    + " apodo = '" + mascota.getApodo() + "' , raza = '" + mascota.getRaza() + "' , idUsuario = " + mascota.getUsuario().getId()
//                    + " WHERE id = '" + mascota.getId() + "'";
//            insertarModificarEliminar(sql);
//        } catch (Exception e) {
//            throw e;
//        } finally {
//            desconectarBase();
//        }
    public Producto buscarProductoPorCodigo(int codigo) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE codigo = " + codigo + ";";
            consultarBase(sql);
            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getInt(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void modificarProducto(Producto producto) throws Exception {

        try {

            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }

            String sql = "UPDATE producto SET "
                    + " nombre = '" + producto.getNombre() + "' , precio = " + producto.getPrecio() + " , codigo_fabricante = "
                    + producto.getCodigoFabricante()
                    + " WHERE codigo = " + producto.getCodigo();

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarProducto(Producto producto) throws Exception {
        try {
            String sql = "DELETE FROM producto WHERE codigo = " + producto.getCodigo();

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

}
