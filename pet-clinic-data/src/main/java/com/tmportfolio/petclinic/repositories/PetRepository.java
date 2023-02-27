package com.tmportfolio.petclinic.repositories;

import com.tmportfolio.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}