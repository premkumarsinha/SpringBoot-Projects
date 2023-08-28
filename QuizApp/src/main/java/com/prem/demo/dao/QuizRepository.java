package com.prem.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prem.demo.model.Quiz;

@Repository 
public interface QuizRepository extends JpaRepository<Quiz,Integer> {

}
