package com.benabder.benabderturf.service;

import com.benabder.benabderturf.model.Course;
import com.benabder.benabderturf.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public Course creerCourse(Course course) {
        if (course.getPartants().size() < 3) {
            throw new IllegalArgumentException("Une course doit avoir au moins 3 partants.");
        }
        return courseRepository.save(course);
    }
}