package com.benabder.benabderturf.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private LocalDate date;
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Partant> partants;
}
