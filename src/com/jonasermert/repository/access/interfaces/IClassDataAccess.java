package com.jonasermert.repository.access.interfaces;

import com.jonasermert.repository.IDataAccessObject;

import java.util.List;

public interface IClassDataAccess extends IDataAccessObject<Class, Integer> {

    void persist(List<Class> classes);
}
