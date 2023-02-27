package com.tmportfolio.petclinic.repositories;

import com.tmportfolio.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}