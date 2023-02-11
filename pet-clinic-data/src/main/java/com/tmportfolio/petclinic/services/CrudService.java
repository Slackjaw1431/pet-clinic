package com.tmportfolio.petclinic.services;

import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface CrudService<T, ID> {
//using generics

    Set<T> findAll();
    T findById(ID id);
    void save(T object);
    void delete(T object);
    void deleteById(ID id);


}