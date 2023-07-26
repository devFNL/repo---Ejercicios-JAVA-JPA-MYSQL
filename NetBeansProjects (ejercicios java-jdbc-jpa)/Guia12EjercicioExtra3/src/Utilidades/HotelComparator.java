/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import Entidad.Hotel;
import java.util.Comparator;

/**
 *
 * @author Jib
 */
public class HotelComparator {
    
    public static Comparator<Hotel> ordenarPorPrecio = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel o1, Hotel o2) {
            return o2.getPrecioHabitaciones().compareTo(o1.getPrecioHabitaciones());
        }
    };
            
    
    

    
}
