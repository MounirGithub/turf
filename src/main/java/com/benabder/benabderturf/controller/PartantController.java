package com.benabder.benabderturf.controller;


import com.benabder.benabderturf.model.Partant;
import com.benabder.benabderturf.service.PartantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/partants")
public class PartantController {
    @Autowired
    private PartantService partantService;

    @PostMapping
    public ResponseEntity<Partant> creerPartant(@RequestBody Partant partant) {
        Partant nouveauPartant = partantService.creerPartant(partant);
        // Publier l'événement sur Kafka
        return new ResponseEntity<>(nouveauPartant, HttpStatus.CREATED);
    }
}
