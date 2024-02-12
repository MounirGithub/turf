package com.benabder.benabderturf.repository;

import com.benabder.benabderturf.model.Partant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartantRepository extends JpaRepository<Partant, Long> {
}