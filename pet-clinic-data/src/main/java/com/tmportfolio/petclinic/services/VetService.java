package com.tmportfolio.petclinic.services;

import com.tmportfolio.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet findByLastName(String lastName);
    Vet save(Vet Vet);
    Set<Vet> findAll();
}
