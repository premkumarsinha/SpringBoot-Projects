package com.prem.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prem.demo.model.Flights;
import com.prem.demo.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer>{

	

}
