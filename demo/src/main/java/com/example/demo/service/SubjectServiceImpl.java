package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Subject;
import com.example.demo.repository.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService{

	 @Autowired
	    private SubjectRepository subjectRepository;
	 
	@Override
	public Subject saveSubject(Subject subject) {
		 return subjectRepository.save(subject);
	}

	@Override
	public List<Subject> getSubjects() {
		return subjectRepository.findAll();
	}
	
}
