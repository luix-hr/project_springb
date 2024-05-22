package com.tceweb.project_sb.controllers;

import com.tceweb.project_sb.controllers.dto.TopicsDto;
import com.tceweb.project_sb.controllers.form.TopicsForm;
import com.tceweb.project_sb.entities.Topics;
import com.tceweb.project_sb.repositories.CourseRepository;
import com.tceweb.project_sb.repositories.TopicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/topics")
public class TopicsController {

    @Autowired
    private TopicsRepository topicsRepository;

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    public List<TopicsDto> topicsList(String courseName){
        if(courseName == null) {
            List<Topics> topics = topicsRepository.findAll();
            return TopicsDto.converter(topics);
        } else{
            List<Topics> topics = topicsRepository.findByCourseName(courseName);
            return TopicsDto.converter(topics);
        }
    }

    @PostMapping
    public void cadastrar(@RequestBody TopicsForm topicsForm){
        Topics topics = topicsForm.converter(courseRepository);
        topicsRepository.save(topics);

    }

}
