package com.tmportfolio.petclinic.model;

import java.util.Set;

public class Vet extends Person{

    private Set<Speciality> specialities;

    public Vet(){
        super();
    }

    public Vet(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }

}