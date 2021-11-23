package com.jonasermert.repository.access;

import com.jonasermert.repository.JpaDataAccessObject;
import com.jonasermert.repository.access.interfaces.IStudentDataAccess;
import com.jonasermert.repository.entities.Student;

import java.util.List;

public class StudentDataAccess extends JpaDataAccessObject<Student, Integer> implements IStudentDataAccess {

    // @NamedQuery(name = Student.SCHUELER_BY_KLASSE, query = "select s from Schueler s inner join s.Klasse k where k.Bezeichnung = :" + Student.SCHUELER_BY_KLASSE_BEZEICHNUNG)

    public void persist(List<Student> students) {

        var transaction = entityManager.getTransaction();
        transaction.begin();

        for(var s : students) {
            entityManager.persist(s);
        }

        transaction.commit();
    }

}
