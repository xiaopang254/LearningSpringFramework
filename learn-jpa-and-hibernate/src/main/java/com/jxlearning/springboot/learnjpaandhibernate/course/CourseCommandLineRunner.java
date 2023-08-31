package com.jxlearning.springboot.learnjpaandhibernate.course;

import com.jxlearning.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.jxlearning.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.jxlearning.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJpaRepository repository;
//    @Autowired
//    private CourseJdbcRepository repository;
    @Autowired
    private CourseSpringDataJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        //Jpa and Jdbc
//        repository.insert(new Course(1, "Learn AWS Jpa!!", "Amazon"));
//        repository.insert(new Course(2, "Learn GCP Jpa!!", "Google"));
//        repository.insert(new Course(3, "Learn Azure Jpa!!", "Microsoft"));
//        repository.deleteById(3);
//
//        System.out.println(repository.findById(2));

        //Spring Data JPA, no need talk to EntityManager, lesser codes to write
        repository.save(new Course(1, "Learn AWS Jpa!!", "Amazon"));
        repository.save(new Course(2, "Learn GCP Jpa!!", "Google"));
        repository.save(new Course(3, "Learn Azure Jpa!!", "Microsoft"));
        repository.deleteById(3l);
        System.out.println(repository.findById(2l));
        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("Google"));
        System.out.println(repository.findByName("Learn AWS Jpa!!"));


    }
}
