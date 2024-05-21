package com.tceweb.project_sb.controller;

import com.tceweb.project_sb.entities.Course;
import com.tceweb.project_sb.entities.Topics;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class TopicsController {

    @RequestMapping("/topics")
    @ResponseBody
    public List<Topics> topicsList(){

        Topics t1 = new Topics("Duvida", "Duvida com Spring", new Course("Spring", "Programação"));
        Topics t2 = new Topics("Duvida", "Duvida com Spring", new Course("Spring", "Programação"));

        return Arrays.asList(t1,t2);
    }

}
