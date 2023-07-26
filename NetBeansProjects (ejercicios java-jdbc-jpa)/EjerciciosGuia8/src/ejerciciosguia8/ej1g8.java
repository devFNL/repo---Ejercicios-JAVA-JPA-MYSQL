/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia8;

import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class ej1g8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opc;
        CuentaBancariaServicio serv = new CuentaBancariaServicio();
//        CuentaBancaria uno = serv.crearCuenta();
          CuentaBancaria uno = serv.crearCuenta();
        
        do {            
            System.out.println("*** Banco ***");
            System.out.println("Ingrese una opcion");
            System.out.println("1. Deposito");
            System.out.println("2. Extraccion");
            System.out.println("3. Extraccion Rapida");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Datos");
            System.out.println("6. Salir");
            opc = sc.nextInt();
            
            switch (opc) {
                case 1:
                    serv.ingresar(uno);
                    break;
                    
                case 2:
                    serv.retirar(uno);
                    break;
                    
                case 3:
                    serv.extraccionRapida(uno);
                    break;
                    
                case 4:
                    serv.consultarSaldo(uno);
                    break;
                    
                case 5:
                    serv.consultarDatos(uno);
                    break;
                    
                case 6:
                    System.out.println("Gracias");
                    break;
            }
            
        } while (opc != 6);
    }
    
}
