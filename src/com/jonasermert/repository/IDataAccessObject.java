package com.jonasermert.repository;

import java.io.Serializable;

public interface IDataAccessObject<E, PK extends Serializable> {

    public void persist(E entity);

    public void remove(E entity);

    public E findById(PK id);
}
