package com.tceweb.project_sb.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Topics {

    private Long id;
    private String title;
    private String message;
    private LocalDateTime dateCreate;
    private StatusTopics status = StatusTopics.NON_ANSWER;
    private User user;
    private Course course;
    private List<Answer> answers = new ArrayList<>();

    public Topics(){

    }

    public Topics(String title, String message, Course course) {
        this.title = title;
        this.message = message;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDateTime getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDateTime dateCreate) {
        this.dateCreate = dateCreate;
    }

    public StatusTopics getStatus() {
        return status;
    }

    public void setStatus(StatusTopics status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topics topics = (Topics) o;
        return Objects.equals(id, topics.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
