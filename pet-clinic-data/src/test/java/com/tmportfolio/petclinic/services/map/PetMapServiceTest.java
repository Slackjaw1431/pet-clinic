package com.tmportfolio.petclinic.services.map;

import com.tmportfolio.petclinic.model.Pet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PetMapServiceTest {

    PetMapService petMapService;

    private final String name = "Snuffles";
//    private final Long petId = 1L;

    @BeforeEach
    void setUp() {
        petMapService = new PetMapService();
        petMapService.save(Pet.builder().name(name).build());
    }

    @Test
    void findAll() {
        Set<Pet> petSet = petMapService.findAll();
        assertEquals(1, petSet.size());
    }

    @Test
    void save() {
        petMapService.save(Pet.builder().name("Topcat").build());
        assertEquals(2, petMapService.findAll().size());
    }

    @Test
    void delete() {
        petMapService.delete(petMapService.findByName(name));
        assertEquals(0, petMapService.findAll().size());
    }

    @Test
    void deleteById() {
        Set<Pet>      pets = petMapService.findAll();
        Pet pet  = pets.iterator().next();
        petMapService.deleteById(pet.getId());
        assertEquals(0, petMapService.findAll().size());
    }

    @Test
    void findById() {
//        Pet pet = petMapService.findById(1L);
        Set<Pet>      pets = petMapService.findAll();
        Pet pet  = pets.iterator().next();
        assertEquals(name, pet.getName());
    }

    @Test
    void findByName() {
        Pet pet = petMapService.findByName(name);
        assertEquals(name, pet.getName());
    }
}