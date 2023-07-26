/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author Jib
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        int menuOpc;
        
        System.out.println("a"+ "\t"+ 1 );
        System.out.println("a"+ "\t"+ 2);
        System.out.println("a"+ "\t"+ 3 );
        System.out.println("a"+ "\t"+ 4);
        System.out.println("a"+ "\t"+ 5 );
        
        System.out.println("a"+ "\n"+ 1 );
        System.out.println("a"+ "\n"+ 2);
        System.out.println("a"+ "\n"+ 3 );
        System.out.println("a"+ "\n"+ 4);
        System.out.println("a"+ "\n"+ 5 );

        do {
            System.out.println("*** Menu ***");
            System.out.println("1. Opc1");
            System.out.println("2. Opc2");
            System.out.println("3. Opc3");
            System.out.println("4. Opc4");
            System.out.println("5. Opc5");
            System.out.println("6. Opc6");
            System.out.println("7. Opc7");
            System.out.println("8. Opc8");
            System.out.println("9. Salir");
            System.out.println("Ingrese una opcion: ");
            menuOpc = sc.nextInt();

            switch (menuOpc) {
                case 1:
                    System.out.println("");
                    ;
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("");
                    break;
                case 8:
                    System.out.println("");
                    break;
                case 9:
                    System.out.println("Salir.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;

            }

        } while (menuOpc != 9);
    }
}
