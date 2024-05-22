package com.tceweb.project_sb.controllers.dto;

import com.tceweb.project_sb.entities.Answer;
import com.tceweb.project_sb.entities.StatusTopics;
import com.tceweb.project_sb.entities.Topics;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DetalhesTopicsDto {

    private Long id;
    private String title;
    private String message;
    private LocalDateTime dateCreate;
    private String nameUser;
    private StatusTopics status;
    private List<AnswerDto> answers;

    public DetalhesTopicsDto(Topics topics) {
        this.id = topics.getId();
        this.title = topics.getTitle();
        this.message = topics.getMessage();
        this.dateCreate = topics.getDateCreate();
        this.nameUser = topics.getUser().getName();
        this.status = topics.getStatus();
        this.answers = new ArrayList<>();
        this.answers.addAll(topics.getAnswers().stream().map(AnswerDto::new).collect(Collectors.toList()));
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
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

    public StatusTopics getStatus() {
        return status;
    }

    public List<AnswerDto> getAnswers() {
        return answers;
    }
}
