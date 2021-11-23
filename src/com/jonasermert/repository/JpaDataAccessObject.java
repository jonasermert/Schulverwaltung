package com.jonasermert.repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaDataAccessObject<E, PK extends Serializable> implements IDataAccessObject<E, PK> {

    protected Class<E> entityClass;
    protected EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public JpaDataAccessObject() {
        this.entityManager = createEntityManager();
        ParameterizedType genericSuperclass = (ParameterizedType) getClass()
                .getGenericSuperclass();
        this.entityClass = (Class<E>) genericSuperclass
                .getActualTypeArguments()[0];
    }

    private EntityManager createEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("THM");
        return emf.createEntityManager();
    }

    @Override
    public E findById(PK id) {
        return entityManager.find(entityClass, id);
    }

    @Override
    public void persist(E entity) {
        entityManager.persist(entity);
    }

    @Override
    public void remove(E entity) {
        entityManager.remove(entity);
    }

}
