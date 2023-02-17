package com.tmportfolio.petclinic.model;

import java.util.Set;

public class Owner extends Person{

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public Owner(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Owner(){
        super();
    }

}