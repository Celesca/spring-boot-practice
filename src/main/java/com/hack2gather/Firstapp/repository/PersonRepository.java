package com.hack2gather.Firstapp.repository;

import com.hack2gather.Firstapp.entities.Person;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository implements PersonDAO{
    private EntityManager entityManager;

    @Autowired
    public PersonRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Person person) {
        entityManager.persist(person);
    }g
}
