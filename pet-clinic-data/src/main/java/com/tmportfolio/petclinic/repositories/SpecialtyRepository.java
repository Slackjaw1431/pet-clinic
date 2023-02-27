package com.tmportfolio.petclinic.repositories;

import com.tmportfolio.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}