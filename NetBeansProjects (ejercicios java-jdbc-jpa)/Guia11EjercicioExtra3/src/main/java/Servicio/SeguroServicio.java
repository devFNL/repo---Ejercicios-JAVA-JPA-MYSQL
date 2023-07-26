/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cliente;
import Entidad.Cuota;
import Entidad.Poliza;
import Entidad.Vehiculo;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class SeguroServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Cliente crearCliente() {

        System.out.println("*Datos del cliente*");
        System.out.println("Ingrese su nombre");
        String nombre = sc.next();
        System.out.println("Ingrese su apellido");
        String apellido = sc.next();
        System.out.println("Ingrese su dni");
        int dni = sc.nextInt();
        System.out.println("Ingrese su e-mail");
        String mail = sc.next();
        System.out.println("Ingrese su direccion");
        String domicilio = sc.next();
        System.out.println("Ingrese su telefono");
        int telefono = sc.nextInt();

        return new Cliente(nombre, apellido, dni, mail, domicilio, telefono);
    }

    public Vehiculo crearVehiculo() {

        System.out.println("*Datos del vehiculo*");
        System.out.println("Ingrese marca");
        String marca = sc.next();
        System.out.println("Ingrese modelo");
        String modelo = sc.next();
        System.out.println("Ingrese año");
        int anio = sc.nextInt();
        System.out.println("Ingrese numero de motor");
        int numMotor = sc.nextInt();
        System.out.println("Ingrese codigo de chasis");
        String chasis = sc.next();
        System.out.println("Ingrese color");
        String color = sc.next();
        System.out.println("Ingrese tipo (sedan/pickup/moto)");
        String tipo = sc.next();

        return new Vehiculo(marca, modelo, anio, numMotor, chasis, color, tipo);

    }

    public Poliza crearPoliza() {

        System.out.println("*Datos de la poliza*");
        int numPoliza = (int) (Math.random()*99999);
        Date fechaIni = new Date(123, 0, 5);
        Date fechaFin = new Date(123, 5, 5);
        int cantCuotas = 6;
        System.out.println("Ingrese forma de pago");
        String formaPago = sc.next();
        double montoAsegurado = 500000;
        boolean granizo = true;
        double montoGranizo = 150000;
        System.out.println("Ingrese tipo de cobertura (total/terceros)");
        String tipoCobertura = sc.next();
        Cliente cliente = crearCliente();
        Vehiculo vehiculo = crearVehiculo();
        Cuota[] cuotas = new Cuota[cantCuotas];
        for (int i = 0; i < cantCuotas; i++) {
            cuotas[i] = crearCuota(i);
        }

        return new Poliza(numPoliza, fechaIni, fechaFin, cantCuotas, formaPago, montoAsegurado, granizo, montoGranizo, tipoCobertura, cliente, vehiculo, cuotas);
    }

    public Cuota crearCuota(int num) {

        int numCuota = num;
        int montoCuota = 50000;
        boolean pagada = false;
        Date fechaVenc = new Date(123, num + 1, 5);
        String formaPago = "Efectivo";

        return new Cuota(numCuota, montoCuota, pagada, fechaVenc, formaPago);
    }

    public void menu() {

        crearPoliza();

    }

}
