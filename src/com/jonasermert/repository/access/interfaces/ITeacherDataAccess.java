package com.jonasermert.repository.access.interfaces;

import com.jonasermert.repository.IDataAccessObject;
import com.jonasermert.repository.entities.Teacher;

import java.util.List;

public interface ITeacherDataAccess extends IDataAccessObject<Teacher, Integer> {

    List<Teacher> byNachname(String nachname);
}
