package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Subject;
import com.example.demo.service.SubjectService;

@RestController
public class SubjectRestController {
	@Autowired
    private SubjectService subjectService;

	@PostMapping("/subject")
    public Subject addSubject(@RequestBody Subject subject) {
        return subjectService.saveSubject(subject);
    }

    @GetMapping("/subjects")
    public List<Subject> getSubjects() {
        return subjectService.getSubjects();
    }
}
