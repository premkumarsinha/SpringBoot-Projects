package com.prem.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.prem.demo.dao.QuestionRepository;
import com.prem.demo.model.Questions;

@Service
public class QuestionService {
	
	@Autowired
	QuestionRepository qr;

	public ResponseEntity<List<Questions>> getAllQuestions() {
		try {
		return new ResponseEntity<>(qr.findAll(),HttpStatus.OK);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<List<Questions>> getAllQuestionsByCategory(String category) {
		try {
		return new ResponseEntity<>(qr.findByCategory(category),HttpStatus.OK);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<String> addQuestion(Questions question) {
		
		qr.save(question);
		return new ResponseEntity<>("Success",HttpStatus.CREATED);
	}

}
