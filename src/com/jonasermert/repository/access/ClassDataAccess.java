package com.jonasermert.repository.access;

import com.jonasermert.repository.JpaDataAccessObject;
import com.jonasermert.repository.access.interfaces.IClassDataAccess;

import java.util.List;

public class ClassDataAccess extends JpaDataAccessObject<Class, Integer> implements IClassDataAccess {

    public void persist(List<Class> classes) {

        var transaction = entityManager.getTransaction();
        transaction.begin();

        for(var c : classes) {
            entityManager.persist(c);
        }

        transaction.commit();
    }

}
