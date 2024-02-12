package com.benabder.benabderturf.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Partant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private int numero;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
