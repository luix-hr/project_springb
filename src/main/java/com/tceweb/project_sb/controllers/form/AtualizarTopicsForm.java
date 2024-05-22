package com.tceweb.project_sb.controllers.form;

import com.tceweb.project_sb.entities.Topics;
import com.tceweb.project_sb.repositories.TopicsRepository;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class AtualizarTopicsForm {

    @NotNull @NotEmpty @Length(min = 5)
    private String title;

    @NotNull @NotEmpty @Length(min = 10)
    private String message;

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

    public Topics atualizar(Long id, TopicsRepository topicsRepository) {
        Topics topics = topicsRepository.getReferenceById(id);
        topics.setTitle(this.title);
        topics.setMessage(this.message);

        return topics;
    }
}
