package com.jonasermert.repository.access.interfaces;

import com.jonasermert.repository.IDataAccessObject;
import com.jonasermert.repository.entities.Person;

import java.util.List;

public interface IPersonDataAccess extends IDataAccessObject<Person, Integer> {

    List<Person> byNachname(String nachname);

    void updateTest();
}
