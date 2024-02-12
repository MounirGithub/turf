package com.benabder.benabderturf.repository;

import com.benabder.benabderturf.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
