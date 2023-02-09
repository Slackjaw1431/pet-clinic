package com.tmportfolio.petclinic.services;

import com.tmportfolio.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet findByName(String name);
    Pet save(Pet Pet);
    Set<Pet> findAll();

}
