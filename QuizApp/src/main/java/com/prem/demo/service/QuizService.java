package com.prem.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.prem.demo.dao.QuestionRepository;
import com.prem.demo.dao.QuizRepository;
import com.prem.demo.model.Questions;
import com.prem.demo.model.Quiz;
import com.prem.demo.model.Response;
import com.prem.demo.model.WrapperQuestion;

@Service
public class QuizService {
	
	@Autowired
	QuizRepository qp;
	
	@Autowired
	QuestionRepository qrepo;

	public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
		
		List<Questions> questions=qrepo.findRandonQuestionsByCategory(category,numQ); 
		Quiz q=new Quiz();
		q.setTitle(title);
		q.setQuestions(questions);
		qp.save(q);
		return new ResponseEntity<>("Success",HttpStatus.CREATED);
}

	public ResponseEntity<List<WrapperQuestion>> getQuizQuestions(int id) {
		
		Optional<Quiz> q=qp.findById(id);
		
		List<Questions> li=q.get().getQuestions();
		List<WrapperQuestion> liqw=new ArrayList<WrapperQuestion>();
		for(Questions ques:li)
		{
			WrapperQuestion wq1=new WrapperQuestion(ques.getId(),ques.getQuestiontitle(),ques.getOption1(),ques.getOption2(),ques.getOption3(),ques.getOption4());
			liqw.add(wq1);
		}
		
		return new ResponseEntity<>(liqw,HttpStatus.OK);
	}

	public ResponseEntity<Integer> getScore(int id,List<Response> res) {
		Quiz quiz=qp.findById(id).get();
		List<Questions> q=quiz.getQuestions();
		int score=0,i=0;
		
		for(Response r:res)
		{
			if(r.getValue().equals(q.get(i++).getRightanswer()))
			
				
				score++;
			
			
			
		}
		return new ResponseEntity<>(score,HttpStatus.OK);
	}

}
