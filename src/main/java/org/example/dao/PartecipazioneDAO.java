package org.example.dao;

import javax.persistence.EntityManager;

public class PartecipazioneDAO {
    private EntityManager em;

    public PartecipazioneDAO(EntityManager em) {
        this.em = em;
    }

//    public void save() {
//        em.getTransaction().begin();
//        em.persist();
//        em.getTransaction().commit();
//    }
}
