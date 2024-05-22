package com.tceweb.project_sb.controllers.dto;

import com.tceweb.project_sb.entities.Answer;

import java.time.LocalDateTime;

public class AnswerDto {

    private Long id;
    private String message;
    private LocalDateTime dateCreate;
    private String nameUser;

    public AnswerDto(Answer answer) {
        this.id = answer.getId();
        this.message = answer.getMessage();
        this.dateCreate = answer.getDateCreate();
        this.nameUser = answer.getUser().getName();

    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getDateCreate() {
        return dateCreate;
    }

    public String getNameUser() {
        return nameUser;
    }
}
