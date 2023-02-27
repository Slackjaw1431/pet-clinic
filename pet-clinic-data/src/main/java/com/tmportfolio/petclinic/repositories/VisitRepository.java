package com.tmportfolio.petclinic.repositories;

import com.tmportfolio.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}