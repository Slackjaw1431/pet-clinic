package com.tmportfolio.petclinic.services;

import com.tmportfolio.petclinic.model.Pet;

import java.util.Set;

public interface PetService extends CrudService<Pet, Long> {

    Pet findByName(String name);

}