package com.tmportfolio.petclinic.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "vets")
public class Vet extends Person{

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name ="vet_specialties", joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialties = new HashSet<>();

//    public Vet(){
//        super();
//    }
//
//    public Vet(String firstName, String lastName) {
//        super(firstName, lastName);
//    }
//
//    public Set<Speciality> getSpecialties() {
//        return specialties;
//    }
//
//    public void setSpecialties(Set<Speciality> specialties) {
//        this.specialties = specialties;
//    }

}