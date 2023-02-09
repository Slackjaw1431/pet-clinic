package com.tmportfolio.petclinic.services;

import com.tmportfolio.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService{

    Owner findById(Long id);
    Owner findByLastName(String lastName);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
