package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class SubjectServiceImpl implements SubjectService{

	  private RestTemplate restTemplate;
	  private String crmRestUrl = "http://host.docker.internal:8080/";
	  
	  public SubjectServiceImpl() {
	        this.restTemplate = new RestTemplate();
	    }
	 
	  @Override
	    public List<Subject> getSubjects() {
	        ResponseEntity<List<Subject>> responseEntity =
	                restTemplate.exchange(crmRestUrl + "subjects", HttpMethod.GET, null,
	                        new ParameterizedTypeReference<List<Subject>>() {});
	        List<Subject> subjects = responseEntity.getBody();
	        return subjects;
	    }

	  @Override
	    public Subject saveSubject(Subject subject) {
	        int subId = subject.getSubId();
	        if (subId == 0) {
	            restTemplate.postForObject(crmRestUrl + "subject", subject, String.class);
	        } else {
	            restTemplate.put(crmRestUrl + "subject", subject);
	        }
			return subject;
	    }
	
}
