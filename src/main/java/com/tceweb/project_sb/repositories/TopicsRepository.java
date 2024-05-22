package com.tceweb.project_sb.repositories;

import com.tceweb.project_sb.entities.Topics;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicsRepository extends JpaRepository<Topics, Long> {

    List<Topics> findByCourseName(String courseName);
}
