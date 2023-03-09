package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
