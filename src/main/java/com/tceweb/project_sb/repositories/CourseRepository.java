package com.tceweb.project_sb.repositories;

import com.tceweb.project_sb.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findByName(String name);
}
