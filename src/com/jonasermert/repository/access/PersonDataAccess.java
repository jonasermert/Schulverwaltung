package com.jonasermert.repository.access;

import com.jonasermert.repository.JpaDataAccessObject;
import com.jonasermert.repository.access.interfaces.IPersonDataAccess;
import com.jonasermert.repository.entities.Person;

public class PersonDataAccess extends JpaDataAccessObject<Person, Integer> implements IPersonDataAccess {

    @Override
    public List<Person> byNachname(String nachname) {

        var select = "select p from Person p where p.Nachname = :name";

        var query = entityManager.createQuery(select);
        query.setParameter("name", nachname);

        return query.getResultList();
    }

    @Override
    public void udpateTest() {
        var person = entityManager.find(Person.class, 2);

        person.setFirstName("David");
        person.setLastName("Stahl");

        var transaction = entityManager.getTransaction();
        transaction.begin();


        transaction.commit();
    }

}
