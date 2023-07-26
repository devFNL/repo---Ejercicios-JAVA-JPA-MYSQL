/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author Jib
 */
public class ProductoServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private ProductoDAO dao;

    public ProductoServicio() {
        this.dao = new ProductoDAO();
    }

    public Collection<Producto> listarProductos() throws Exception {

        try {

            Collection<Producto> productos = dao.listarProductos();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarNombreProductos() throws Exception {

        try {

            Collection<Producto> productos = listarProductos();

            if (productos.isEmpty()) {
                throw new Exception("No existen productos para mostrar");
            } else {
                for (Producto aux : productos) {
                    System.out.println("Nombre: " + aux.getNombre());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarNombrePrecioProductos() throws Exception {

        try {

            Collection<Producto> productos = listarProductos();

            if (productos.isEmpty()) {
                throw new Exception("No existen productos para mostrar");
            } else {
                for (Producto aux : productos) {
                    System.out.println("Nombre: " + aux.getNombre() + " | Precio: $" + aux.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarPrecioEntre() throws Exception {

        try {

            Collection<Producto> productos = listarProductos();

            if (productos.isEmpty()) {
                throw new Exception("No existen productos para mostrar");
            } else {
                for (Producto aux : productos) {
                    if (aux.getPrecio() > 120 && aux.getPrecio() < 202) {
                        System.out.println("Nombre: " + aux.getNombre() + " | Precio: $" + aux.getPrecio());
                    }

                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarPortatil() throws Exception {

        try {

            Collection<Producto> productos = listarProductos();

            if (productos.isEmpty()) {
                throw new Exception("No existen productos para mostrar");
            } else {
                for (Producto aux : productos) {
                    if (aux.getNombre().toLowerCase().contains("portátil")) {
                        System.out.println("Nombre: " + aux.getNombre() + " | Precio: $" + aux.getPrecio());
                    }

                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarMasBarato() throws Exception {
        try {
            Collection<Producto> productos = listarProductos();

            if (productos.isEmpty()) {
                throw new Exception("No existen productos para mostrar");
            } else {
                Producto masBarato = null;

                for (Producto aux : productos) {
                    if (masBarato == null || aux.getPrecio() < masBarato.getPrecio()) {
                        masBarato = aux;
                    }
                }

                if (masBarato != null) {
                    System.out.println("Producto más barato:");
                    System.out.println("Nombre: " + masBarato.getNombre() + " | Precio: $" + masBarato.getPrecio());
                } else {
                    System.out.println("No se encontró un producto más barato.");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void crearProducto(String nombre, double precio, int codigoFabricante) throws Exception {
        try {

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe ingresar un nombre");
            }
            if (precio < 0) {
                throw new Exception("Debe ingresar un precio");
            }
            if (codigoFabricante < 0) {
                throw new Exception("Debe ingresar un codigo de fabricante");
            }

            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);
            dao.guardarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }

    public Producto buscarProductoPorCodigo(int codigo) throws Exception {

        try {

            if (codigo < 0) {
                throw new Exception("Debe indicar el codigo");
            }
            Producto producto = dao.buscarProductoPorCodigo(codigo);

            if (producto == null) {
                throw new Exception("No se econtró mascota para el correo electrónico indicado");
            }

            return producto;
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProducto(int codigo) throws Exception {

        try {

            if (codigo < 0) {
                throw new Exception("Codigo incorrecto");
            }

            Producto producto = buscarProductoPorCodigo(codigo);

            System.out.println("Ingrese nuevo nombre");
            String nuevoNombre = sc.next();
            System.out.println("Ingrese nuevo precio");
            double nuevoPrecio = sc.nextDouble();
            System.out.println("Ingrese nuevo codigo de fabricante");
            int nuevoCodigoFabricante = sc.nextInt();

            producto.setNombre(nuevoNombre);
            producto.setPrecio(nuevoPrecio);
            producto.setCodigoFabricante(nuevoCodigoFabricante);

            dao.modificarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }

}
