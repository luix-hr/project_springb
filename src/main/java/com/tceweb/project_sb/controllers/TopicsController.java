package com.tceweb.project_sb.controllers;

import com.tceweb.project_sb.controllers.dto.DetalhesTopicsDto;
import com.tceweb.project_sb.controllers.dto.TopicsDto;
import com.tceweb.project_sb.controllers.form.AtualizarTopicsForm;
import com.tceweb.project_sb.controllers.form.TopicsForm;
import com.tceweb.project_sb.entities.Topics;
import com.tceweb.project_sb.repositories.CourseRepository;
import com.tceweb.project_sb.repositories.TopicsRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

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
    @Transactional
    public ResponseEntity<TopicsDto> cadastrar(@RequestBody @Valid TopicsForm topicsForm, UriComponentsBuilder uribuilder){
        Topics topics = topicsForm.converter(courseRepository);
        topicsRepository.save(topics);

        URI uri = uribuilder.path("/topics/{id}").buildAndExpand(topics.getId()).toUri();
        return ResponseEntity.created(uri).body(new TopicsDto(topics));

    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalhesTopicsDto> detalhar(@PathVariable Long id){
        Optional<Topics> topics = topicsRepository.findById(id);
        if (topics.isPresent()){
        return ResponseEntity.ok(new DetalhesTopicsDto(topics.get()));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<TopicsDto> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizarTopicsForm atualizarTopicsForm){
        Optional<Topics> optional = topicsRepository.findById(id);
        if (optional.isPresent()){
            Topics topics = atualizarTopicsForm.atualizar(id, topicsRepository);
            return ResponseEntity.ok(new TopicsDto(topics));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    @Transactional
    public  ResponseEntity<?> remover(@PathVariable Long id){
        Optional<Topics> optional = topicsRepository.findById(id);
        if (optional.isPresent()){
            topicsRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
