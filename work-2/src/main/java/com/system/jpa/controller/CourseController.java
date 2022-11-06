package com.system.jpa.controller;

import com.system.jpa.domain.Course;
import com.system.jpa.jpa.CourseJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author Name: experiment-project
 * Date: 2022/11/6 17:19
 * DAY_NAME: 星期日
 */
@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseJpa courseJpa;

    @GetMapping("/findAll")
    public List<Course> findAll() {
        return courseJpa.findAll();
    }

    @PostMapping("/save")
    public Course save(Course course) {
        return courseJpa.save(course);
    }

    @PostMapping("/delete/{id}")
    public void deleteById(@PathVariable String id) {
        courseJpa.deleteById(id);
    }
}
