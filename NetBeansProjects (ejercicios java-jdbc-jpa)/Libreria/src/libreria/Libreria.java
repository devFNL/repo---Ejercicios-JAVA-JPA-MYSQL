/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.Date;
import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Cliente;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;
import libreria.servicios.AutorServicio;
import libreria.servicios.ClienteServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;
import libreria.servicios.PrestamoServicio;

/**
 *
 * @author Jib
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        // completo el ej 1 y 1 extra. 

        try {

            AutorServicio as = new AutorServicio();
            EditorialServicio es = new EditorialServicio();
            LibroServicio ls = new LibroServicio();
            ClienteServicio cs = new ClienteServicio();
            PrestamoServicio ps = new PrestamoServicio();
//
//            Autor autor1 = as.crearAutor("J.R.R. Tolkien");
//            Autor autor2 = as.crearAutor("J.K. Rowling");
//            Autor autor3 = as.crearAutor("George R.R. Martin");
//            Autor autor4 = as.crearAutor("Patrick Rothfuss");
//            Autor autor5 = as.crearAutor("C.S. Lewis");
//            Autor autor6 = as.crearAutor("Brandon Sanderson");
//            Autor autor7 = as.crearAutor("Neil Gaiman");
//            Autor autor8 = as.crearAutor("Margaret Weis y Tracy Hickman");
//
//            Editorial editorial1 = es.crearEditorial("Minotauro");
//            Editorial editorial2 = es.crearEditorial("Salamandra");
//            Editorial editorial3 = es.crearEditorial("Gigamesh");
//            Editorial editorial4 = es.crearEditorial("Plaza & Janes");
//            Editorial editorial5 = es.crearEditorial("Destino");
//            Editorial editorial6 = es.crearEditorial("Ediciones B");
//            Editorial editorial7 = es.crearEditorial("Roca Editorial");
//            Editorial editorial8 = es.crearEditorial("Timun Mas");
//
//            Libro libro1 = ls.crearLibro(9788499082475L, "El Señor de los Anillos", 1954, 500, 100, 400, autor1, editorial1);
//            Libro libro2 = ls.crearLibro(9788478884957L, "Harry Potter y la Piedra Filosofal", 1997, 1000, 200, 800, autor2, editorial2);
//            Libro libro3 = ls.crearLibro(9788496208690L, "Canción de Hielo y Fuego", 1996, 800, 150, 650, autor3, editorial3);
//            Libro libro4 = ls.crearLibro(9788401352836L, "El nombre del viento", 2007, 600, 50, 550, autor4, editorial4);
//            Libro libro5 = ls.crearLibro(9788408062783L, "Las Crónicas de Narnia", 1950, 700, 100, 600, autor5, editorial5);
//            Libro libro6 = ls.crearLibro(9788466657500L, "Elantris", 2005, 400, 80, 320, autor6, editorial6);
//            Libro libro7 = ls.crearLibro(9788496208691L, "Tormenta de Espadas", 2000, 900, 200, 700, autor3, editorial3);
//            Libro libro8 = ls.crearLibro(9788499895566L, "American Gods", 2001, 500, 70, 430, autor7, editorial7);
//            Libro libro9 = ls.crearLibro(9788448034643L, "El Ciclo de la Puerta de la Muerte", 1984, 400, 80, 320, autor8, editorial8);
//            Libro libro10 = ls.crearLibro(9788498387087L, "Animales Fantásticos y Dónde Encontrarlos", 2001, 400, 80, 320, autor2, editorial2);
//
//            System.out.println(as.buscarAutorPorNombre("J.R.R. Tolkien").toString());
//            System.out.println(es.buscarEditorialPorNombre("Roca Editorial").toString());
//            System.out.println(ls.buscarLibroPorISBN(9788478884957L).toString());
//            System.out.println(ls.buscarLibroPorTitulo("Canción de Hielo y Fuego").toString());
//            System.out.println(ls.buscarLibrosPorAutor("J.K. Rowling").toString());
//            System.out.println(ls.buscarLibrosPorEditorial("Salamandra").toString());
//
//            Cliente cliente1 = cs.crearCliente("Laura", "Perez", 35462452L, "3516584795");
//            Cliente cliente2 = cs.crearCliente("Jose", "Rodriguez", 27548657L, "3543587965");
//            Cliente cliente3 = cs.crearCliente("Miguel", "Montoya", 42856987L, "3513456987");
//            Cliente cliente4 = cs.crearCliente("Ana", "Garcia", 10987465L, "3547856987");
//            Cliente cliente5 = cs.crearCliente("Pedro", "Lopez", 54789623L, "3514785962");
//            Cliente cliente6 = cs.crearCliente("Carolina", "Martinez", 21543698L, "3546985236");
//            Cliente cliente7 = cs.crearCliente("Javier", "Fernandez", 36852479L, "3512456987");
//            Cliente cliente8 = cs.crearCliente("Valeria", "Sanchez", 55476213L, "3546985247");
//            Cliente cliente9 = cs.crearCliente("Lucas", "Torres", 52987541L, "3514523698");
//            Cliente cliente10 = cs.crearCliente("Marina", "Gomez", 41596874L, "3549875698");
//
//            Prestamo prestamo1 = ps.crearPrestamo(cliente3, libro2, new Date(123, 02, 14), new Date(123, 03, 02));
//            Prestamo prestamo2 = ps.crearPrestamo(cliente3, libro3, new Date(123, 03, 12), new Date(123, 04, 29));
//            Prestamo prestamo3 = ps.crearPrestamo(cliente2, libro1, new Date(123, 05, 20), new Date(123, 06, 10));
//            Prestamo prestamo4 = ps.crearPrestamo(cliente5, libro2, new Date(123, 07, 05), new Date(123, 07, 20));
//            Prestamo prestamo5 = ps.crearPrestamo(cliente1, libro4, new Date(123, 06, 18), new Date(123, 07, 05));
//            Prestamo prestamo6 = ps.crearPrestamo(cliente4, libro5, new Date(123, 07, 30), new Date(123, 10, 15));
//            Prestamo prestamo7 = ps.crearPrestamo(cliente6, libro3, new Date(123, 10, 22), new Date(123, 11, 10));
//            Prestamo prestamo8 = ps.crearPrestamo(cliente7, libro4, new Date(123, 11, 11), new Date(124, 00, 02));
//            Prestamo prestamo9 = ps.crearPrestamo(cliente10, libro2, new Date(124, 00, 15), new Date(124, 01, 01));
//            Prestamo prestamo10 = ps.crearPrestamo(cliente9, libro1, new Date(124, 01, 25), new Date(124, 02, 10));
//            Prestamo prestamo11 = ps.crearPrestamo(cliente8, libro3, new Date(124, 02, 10), new Date(124, 02, 25));
//            Prestamo prestamo12 = ps.crearPrestamo(cliente4, libro6, new Date(124, 03, 01), new Date(124, 03, 16));
//            Prestamo prestamo13 = ps.crearPrestamo(cliente6, libro2, new Date(124, 03, 20), new Date(124, 04, 05));
//            Prestamo prestamo14 = ps.crearPrestamo(cliente7, libro7, new Date(124, 04, 10), new Date(124, 04, 25));
//            Prestamo prestamo15 = ps.crearPrestamo(cliente5, libro1, new Date(124, 05, 02), new Date(124, 05, 17));
//            Prestamo prestamo16 = ps.crearPrestamo(cliente3, libro3, new Date(124, 05, 20), new Date(124, 06, 05));
//            Prestamo prestamo17 = ps.crearPrestamo(cliente1, libro2, new Date(124, 06, 10), new Date(124, 06, 25));
//            Prestamo prestamo18 = ps.crearPrestamo(cliente9, libro5, new Date(124, 06, 28), new Date(124, 07, 12));
//            Prestamo prestamo19 = ps.crearPrestamo(cliente8, libro9, new Date(124, 07, 15), new Date(124, 07, 30));
//            Prestamo prestamo20 = ps.crearPrestamo(cliente2, libro8, new Date(124, 06, 05), new Date(124, 07, 20));
//            System.out.println(ps.listarPrestamoPorCliente("Miguel").toString());
            List<Cliente> clientes = cs.listarClientes();

            for (Cliente aux : clientes) {
                System.out.println(aux.toString());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }

    }

}
