package org.example.dao;

import javax.persistence.EntityManager;

public class LocationDAO {
    private EntityManager em;

    public LocationDAO(EntityManager em) {
        this.em = em;
    }

//    public void save() {
//        em.getTransaction().begin();
//        em.persist();
//        em.getTransaction().commit();
//    }
}
