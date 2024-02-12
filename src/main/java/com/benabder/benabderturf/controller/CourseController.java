package com.benabder.benabderturf.controller;

import com.benabder.benabderturf.model.Course;
import com.benabder.benabderturf.producer.CourseProducer;
import com.benabder.benabderturf.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @Autowired
    private CourseProducer courseProducer;

    @PostMapping
    public ResponseEntity<Course> creerCourse(@RequestBody Course course) {
        Course nouvelleCourse = courseService.creerCourse(course);
        courseProducer.sendMessage("Une nouvelle course a été créée : " + course.getNom());
        return new ResponseEntity<>(nouvelleCourse, HttpStatus.CREATED);
    }
}
