/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ironman;

import Entidad.Armadura;
import Entidad.Bota;
import Entidad.Casco;
import Entidad.Guante;
import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class IronMan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        float bat = 100f;

        Bota bota1 = new Bota((float) (bat * 0.01), false);
        Bota bota2 = new Bota((float) (bat * 0.01), false);
        Guante guante1 = new Guante((float) (bat * 0.02), false);
        Guante guante2 = new Guante((float) (bat * 0.02), false);
        Casco casco = new Casco("", "", (float) (bat * 0.01), false);

        Armadura armadura = new Armadura("Dorado", "Rojo", 9, 100, 100f, bota1, bota2, guante1, guante2, casco);

        armadura.mostrarEstado();
        armadura.mostrarBateria();
        armadura.usarGuantes(2);
        armadura.mostrarBateria();

        armadura.sufriendoDanos(guante1);

        int menuOpc;

        do {
            System.out.println("*** J.A.R.V.I.S. ***");
            System.out.println("1. Mostrar estado general");
            System.out.println("2. Mostrar bateria");
            System.out.println("3. Caminar");
            System.out.println("4. Correr");
            System.out.println("5. Propulsarse");
            System.out.println("6. Volar");
            System.out.println("7. Disparar");
            System.out.println("8. Escribir en consola");
            System.out.println("9. Revisar dispositivos");
            System.out.println("10. Reparar daños");
            System.out.println("11. Usar radar");
            System.out.println("12. Simulador de radar");
            System.out.println("12. Destruir enemigos");
            System.out.println("13. Acciones evasivas");
            System.out.println("14. Salir");

            System.out.println("Ingrese una opcion: ");
            menuOpc = sc.nextInt();

            switch (menuOpc) {
                case 1:
                    armadura.mostrarEstado();
                    break;
                case 2:
                    armadura.mostrarBateria();
                    break;
                case 3:
                    System.out.println("Ingrese cantidad de segundos que desea caminar");
                    armadura.caminar(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Ingrese cantidad de segundos que desea correr");
                    armadura.correr(sc.nextInt());
                    break;
                case 5:
                    System.out.println("Ingrese cantidad de segundos que desea propulsarse");
                    armadura.propulsar(sc.nextInt());
                    break;
                case 6:
                    System.out.println("Ingrese cantidad de segundos que desea volar");
                    armadura.volar(sc.nextInt());
                    break;
                case 7:
                    System.out.println("Ingrese cantidad de segundos que desea disparar");
                    armadura.usarGuantes(sc.nextInt());
                    break;
                case 8:
                    System.out.println("Ingrese el mensaje en consola: ");
                    armadura.escribirConsola();
                    break;
                case 9:
                    armadura.revisarDispositivos();
                    break;
                case 10:
                    System.out.println("Ingrese el nombre del dispositivo que quiere reparar");
                    armadura.repararDanos(sc.next());
                    break;
                case 11:
                    System.out.println("Radar.");
                    break;
                case 12:
                    System.out.println("Salir.");
                    break;
                case 13:
                    System.out.println("Salir.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;

            }

        } while (menuOpc != 9);
    }

}
