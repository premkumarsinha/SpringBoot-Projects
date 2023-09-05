package com.prem.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.prem.demo.dao.AirlineRepository;
import com.prem.demo.model.Flights;

@Service
public class AirlineService {

	@Autowired
	AirlineRepository repo;
	public ResponseEntity<String> addFlights(Flights flight) {
		try {
		repo.save(flight);
		return new ResponseEntity<>("success",HttpStatus.CREATED);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return new ResponseEntity<>("Flight couldn't be added",HttpStatus.BAD_REQUEST);
	}
	public ResponseEntity<List<Flights>> showAllFlights() {
		try {
		List<Flights> li= repo.findAll();
		return new ResponseEntity<>(li,HttpStatus.OK);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
		
	}
	public ResponseEntity<Flights> deleteFlight(int id) {
		try {
		Flights flight=repo.findById(id).get();
		repo.deleteById(id);
		return new ResponseEntity<>(flight,HttpStatus.OK);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return new ResponseEntity<>(new Flights(),HttpStatus.BAD_REQUEST);
	}
	public ResponseEntity<String> updateFlight(Flights flight) {
		try {
		repo.save(flight);
		return new ResponseEntity<>("record updated",HttpStatus.OK);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return new ResponseEntity<>("Record couldn't be updated",HttpStatus.BAD_REQUEST);
	}
	
	

}
