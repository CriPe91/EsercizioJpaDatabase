package org.example;

import org.example.entities.Evento;
import org.example.entities.tipoEvento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class EventoDAO
{
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("progettoMavenPersistenza");
    private static EntityManager em = emf.createEntityManager();


    public static void main( String[] args ) {

        LocalDate data = LocalDate.parse("2025-04-09");

        Evento event = new Evento("Congresso",data,"Sarà un gran congresso", tipoEvento.pubblico,1000);
        save(event);

        em.close();
        emf.close();
    }

    public static void save(Evento event) {
        em.getTransaction().begin();
        em.persist(event);
        em.getTransaction().commit();
    }

    public static void getById()

}
