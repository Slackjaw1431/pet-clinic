package com.tmportfolio.petclinic.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity{

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "description")
    private String    description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet       pet;

    public LocalDate getDate(){
        return date;
    }
}