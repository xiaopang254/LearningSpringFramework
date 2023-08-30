package com.jxlearning.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/*
Course: id, name, author
*/
@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "In 30 Minutes"),
                new Course(2, "Learn DevOps", "In 100 Hour"),
                new Course(3, "Learn Azure", "In 1 Minute"),
                new Course(4, "Learn Google", "In 5 Minute"),
                new Course(5, "Learn how to cook", "In 1 Minute")
        );

    }
}
