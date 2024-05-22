package com.tceweb.project_sb.controllers.form;

import com.tceweb.project_sb.entities.Course;
import com.tceweb.project_sb.entities.Topics;
import com.tceweb.project_sb.repositories.CourseRepository;
import com.tceweb.project_sb.repositories.TopicsRepository;

public class TopicsForm {

    private String title;
    private String message;
    private String nameCourse;

    public TopicsForm(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public Topics converter(CourseRepository courseRepository) {
        Course course = courseRepository.findByName(nameCourse);
        return new Topics(title, message, course);
    }
}
