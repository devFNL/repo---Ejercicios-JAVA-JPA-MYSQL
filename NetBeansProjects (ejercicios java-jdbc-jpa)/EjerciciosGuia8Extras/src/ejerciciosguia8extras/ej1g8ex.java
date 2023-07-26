    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia8extras;

import Entidad.Raices;
import Servicio.RaicesServicio;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class ej1g8ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de a, b y c");


        Raices raiz = new Raices(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        RaicesServicio serv = new RaicesServicio();
        

        serv.calcular(raiz);
        
    }
    
}
