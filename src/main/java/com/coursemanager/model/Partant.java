package com.coursemanager.model;

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
    private Course course;

    public Partant(String nom, int i) {
        this.nom = nom;
        this.numero = i;
    }
}
