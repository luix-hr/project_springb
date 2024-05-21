package com.tceweb.project_sb.controllers;

import com.tceweb.project_sb.controllers.dto.TopicsDto;
import com.tceweb.project_sb.entities.Topics;
import com.tceweb.project_sb.repositories.TopicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicsController {

    @Autowired
    private TopicsRepository topicsRepository;

    @RequestMapping("/topics")
    public List<TopicsDto> topicsList(){
        List<Topics> topics = topicsRepository.findAll();
        return TopicsDto.converter(topics);
    }

}
