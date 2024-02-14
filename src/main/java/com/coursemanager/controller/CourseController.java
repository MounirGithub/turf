package com.coursemanager.controller;

import com.coursemanager.model.Course;
import com.coursemanager.model.Partant;
import com.coursemanager.producer.CourseProducer;
import com.coursemanager.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @Autowired
    private CourseProducer courseProducer;

    @PostMapping("/sendCourse")
    public ResponseEntity<Course> creerCourse(@RequestBody Course course) {
        Course nouvelleCourse = courseService.creerCourse(course);
        courseProducer.sendMessage("Une nouvelle course a été créée : " + course.getNom());
        return new ResponseEntity<>(nouvelleCourse, HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Course>> recupererCourse() {
        return ResponseEntity.ok(courseService.recupCourses());
    }
}
