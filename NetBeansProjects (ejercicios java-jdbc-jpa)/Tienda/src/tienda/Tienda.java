/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.Scanner;
import tienda.servicios.FabricanteServicio;
import tienda.servicios.ProductoServicio;

/**
 *
 * @author Jib
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        ProductoServicio proServ = new ProductoServicio();
        FabricanteServicio fabServ = new FabricanteServicio();
                
        
//        proServ.mostrarNombreProductos();
//        proServ.mostrarNombrePrecioProductos();
//        proServ.mostrarPrecioEntre();
//        proServ.mostrarPortatil();
//        proServ.mostrarMasBarato();

//        System.out.println("ingrese el codigo de producto a modificar");
//        proServ.modificarProducto(sc.nextInt());
//          
//        proServ.mostrarNombrePrecioProductos();


//        System.out.println("Ingrese Nombre del producto, precio y codigo de fabricante");
//        proServ.crearProducto(sc.next(), sc.nextDouble(), sc.nextInt());
//        fabServ.crearFabricante(sc.next());
            
        
    }
    
}
