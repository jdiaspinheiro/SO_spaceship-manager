package com.celfocus.training.spaceover.spaceship.manager.service;

import java.util.List;

public interface CrudService<T> {

    List<T> findAll();

    T findBydId(String id);

    T save(T entity);

    T update(T entity);

    void deleteById(String id);
}

