package com.prem.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prem.demo.model.Questions;
import com.prem.demo.service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {

	@Autowired
	QuestionService qs;
	
	@GetMapping("allQuestions")
	public ResponseEntity<List<Questions>> getAllQuestions()
	{
		return qs.getAllQuestions();
	}
	
	@GetMapping("category/{category}")
	public ResponseEntity<List<Questions>> getAllQuestionsByCategory(@PathVariable String category)
	{
		return qs.getAllQuestionsByCategory(category);
	}
	
	@PostMapping("addquestion")
	public ResponseEntity<String> addQuestion(@RequestBody Questions question)
	{
		return qs.addQuestion(question);
	}
}
