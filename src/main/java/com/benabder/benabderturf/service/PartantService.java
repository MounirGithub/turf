package com.benabder.benabderturf.service;


import com.benabder.benabderturf.model.Partant;
import com.benabder.benabderturf.repository.PartantRepository;
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
