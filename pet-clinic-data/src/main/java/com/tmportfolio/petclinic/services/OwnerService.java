package com.tmportfolio.petclinic.services;

import com.tmportfolio.petclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastname);
}