package com.jonasermert.repository.access;

import com.jonasermert.repository.JpaDataAccessObject;
import com.jonasermert.repository.access.interfaces.ITeacherDataAccess;
import com.jonasermert.repository.entities.Teacher;

import javax.persistence.Query;

import java.util.List;

public class TeacherDataAccess extends JpaDataAccessObject<Teacher, Integer> implements ITeacherDataAccess {

    public List<Teacher> byNachname(String nachname) {

        String select = "select l from Lehrer l where l.Nachname = :name";

        Query query = entityManager.createQuery(select);
        query.setParameter("name", nachname);

        return query.getResultList();
    }
}
