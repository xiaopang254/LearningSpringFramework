package com.jxlearning.springboot.learnjpaandhibernate.course.jpa;

import com.jxlearning.springboot.learnjpaandhibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    //    @Autowired
    @PersistenceContext // More specific than Autowired
    private EntityManager entityManager;


    public void insert(Course course) {
        entityManager.merge(course); //Mapped using JPA, bean
    }

    public Course findById(long id) {
        return entityManager.find(Course.class, id);
    }
    public void deleteById(long id) {
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

}
