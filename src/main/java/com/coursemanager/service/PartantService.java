package com.coursemanager.service;


import com.coursemanager.model.Partant;
import com.coursemanager.repository.PartantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartantService {
    @Autowired
    private PartantRepository partantRepository;

    public Partant creerPartant(Partant partant) {
        return partantRepository.save(partant);
    }
}
