package com.tmportfolio.petclinic.bootstrap;

import com.tmportfolio.petclinic.model.Owner;
import com.tmportfolio.petclinic.model.Pet;
import com.tmportfolio.petclinic.model.PetType;
import com.tmportfolio.petclinic.model.Vet;
import com.tmportfolio.petclinic.services.OwnerService;
import com.tmportfolio.petclinic.services.PetTypeService;
import com.tmportfolio.petclinic.services.VetService;
import com.tmportfolio.petclinic.services.map.OwnerMapService;
import com.tmportfolio.petclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService =  petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("1231231234");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("1231231234");

        Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);


        Vet vet1 = new Vet();
        vet1.setFirstName("Mrs.");
        vet1.setLastName("Cat");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Mrs.");
        vet2.setLastName("Dog");

        vetService.save(vet2);

        System.out.println("Loading vets...");



    }
}