package com.tceweb.project_sb.entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class Answer {

    private Long id;
    private String message;
    private Topics topics;
    private LocalDateTime dateCreate;
    private User user;
    private Boolean solution = false;

    public Answer(){

    }

    public Answer(Long id, String message, Topics topics, LocalDateTime dateCreate, User user, Boolean solution) {
        this.id = id;
        this.message = message;
        this.topics = topics;
        this.dateCreate = dateCreate;
        this.user = user;
        this.solution = solution;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Topics getTopics() {
        return topics;
    }

    public void setTopics(Topics topics) {
        this.topics = topics;
    }

    public LocalDateTime getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDateTime dateCreate) {
        this.dateCreate = dateCreate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Boolean getSolution() {
        return solution;
    }

    public void setSolution(Boolean solution) {
        this.solution = solution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return Objects.equals(id, answer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
