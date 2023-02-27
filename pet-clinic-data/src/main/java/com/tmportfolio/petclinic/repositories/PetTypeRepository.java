package com.tmportfolio.petclinic.repositories;

import com.tmportfolio.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}