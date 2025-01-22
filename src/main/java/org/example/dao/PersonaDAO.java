package org.example.dao;

import org.example.entities.Evento;

import javax.persistence.EntityManager;

public class PersonaDAO {

    private EntityManager em;

    public PersonaDAO(EntityManager em) {
        this.em = em;
    }

//    public void save() {
//        em.getTransaction().begin();
//        em.persist();
//        em.getTransaction().commit();
//    }

}
