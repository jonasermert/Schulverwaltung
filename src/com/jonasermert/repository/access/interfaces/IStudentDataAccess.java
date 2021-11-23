package com.jonasermert.repository.access.interfaces;

import com.jonasermert.repository.IDataAccessObject;
import com.jonasermert.repository.entities.Student;

import java.util.List;

public interface IStudentDataAccess extends IDataAccessObject<Student, Integer> {

    void persist(List<Student> students);
}
