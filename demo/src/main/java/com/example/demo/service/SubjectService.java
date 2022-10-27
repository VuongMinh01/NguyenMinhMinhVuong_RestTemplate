package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Subject;

public interface SubjectService {
	public Subject saveSubject(Subject subject);
	public List<Subject> getSubjects();
}
