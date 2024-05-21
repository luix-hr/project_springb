package com.tceweb.project_sb.controller;

import com.tceweb.project_sb.controller.dto.TopicsDto;
import com.tceweb.project_sb.entities.Course;
import com.tceweb.project_sb.entities.Topics;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicsController {

    @RequestMapping("/topics")
    public List<TopicsDto> topicsList(){

        Topics t1 = new Topics("Duvida", "Duvida com Spring", new Course("Spring", "Programação"));
        Topics t2 = new Topics("Duvida", "Duvida com Spring", new Course("Spring", "Programação"));

        return TopicsDto.converter(Arrays.asList(t1,t2));
    }

}
