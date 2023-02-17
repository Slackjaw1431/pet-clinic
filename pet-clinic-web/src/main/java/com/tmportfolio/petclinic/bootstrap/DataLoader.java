package com.tmportfolio.petclinic.bootstrap;

import com.tmportfolio.petclinic.model.Owner;
import com.tmportfolio.petclinic.model.Vet;
import com.tmportfolio.petclinic.services.OwnerService;
import com.tmportfolio.petclinic.services.VetService;
import com.tmportfolio.petclinic.services.map.OwnerMapService;
import com.tmportfolio.petclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Mike");
        owner1.setLastName("West");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Bill");
        owner2.setLastName("Blue");

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