package com.prem.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prem.demo.model.Questions;


@Repository
public interface QuestionRepository extends JpaRepository<Questions, Integer> {

	
	List<Questions> findByCategory(String category);

	@Query(value="SELECT * FROM questions AS q WHERE q.category=:category ORDER BY RAND() LIMIT :numQ",nativeQuery=true)
	List<Questions> findRandonQuestionsByCategory(String category,int numQ);

}
