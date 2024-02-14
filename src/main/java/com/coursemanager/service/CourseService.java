package com.coursemanager.service;

import com.coursemanager.model.Course;
import com.coursemanager.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Course> recupCourses() {
        return courseRepository.findAll();
    }
}