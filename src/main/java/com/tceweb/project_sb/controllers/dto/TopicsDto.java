package com.tceweb.project_sb.controllers.dto;

import com.tceweb.project_sb.entities.Topics;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class TopicsDto {

    private Long id;
    private String title;
    private String message;
    private LocalDateTime dateCreate;

    public TopicsDto(Topics topics){
        this.id = topics.getId();
        this.title = topics.getTitle();
        this.message = topics.getMessage();
        this.dateCreate = topics.getDateCreate();

    }

    public static List<TopicsDto> converter(List<Topics> topics) {
        return topics.stream().map(TopicsDto::new).collect(Collectors.toList());
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
}
