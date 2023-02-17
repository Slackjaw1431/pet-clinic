package com.tmportfolio.petclinic.model;

import java.time.LocalDate;

public class Visit {

    private LocalDate date;
    private String description;
    private Pet pet;

    public Visit(){
        this.date = LocalDate.now();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}