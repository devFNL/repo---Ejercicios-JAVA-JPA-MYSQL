/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Jib
 */
public class Hotel1 extends Hotel {

    protected Double precio;
    protected Double superficie;
    protected boolean bano = true;
    protected boolean ascensor = true;
    protected boolean calefaccion = true;

    public Hotel1(Double precio, Double superficie, Integer cantHab) {
        super(cantHab);
        this.precio = precio;
        this.superficie = superficie;
    }

}
