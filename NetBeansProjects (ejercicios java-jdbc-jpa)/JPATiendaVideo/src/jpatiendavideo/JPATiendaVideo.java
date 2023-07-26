/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpatiendavideo;

import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jib
 */
public class JPATiendaVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATiendaVideoPU");
            EntityManager em = emf.createEntityManager();

            try {

                Fabricante fabricante1 = new Fabricante();
                fabricante1.setId(UUID.randomUUID().toString());
                fabricante1.setCodigo(1);
                fabricante1.setNombre("Asus");

                em.getTransaction().begin();
                em.persist(fabricante1);
                em.getTransaction().commit();

            } catch (Exception e) {
            }

        } catch (Exception e) {
        }
    }

}
