package com.prem.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prem.demo.model.Flights;
import com.prem.demo.service.AirlineService;

@RestController
@RequestMapping("airlines")
public class AirlineController {

	@Autowired
	AirlineService service;
	@PostMapping("add")
	public ResponseEntity<String> addFlights(@RequestBody Flights flight)
	{
		return service.addFlights(flight);
	}
	
	@GetMapping("allFlights")
	public ResponseEntity<List<Flights>> showAllFights()
	{
		
		return service.showAllFlights();
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<Flights> deleteFlight(@PathVariable int id )
	{
		return service.deleteFlight(id);
	}
	
	@PutMapping("updateFlight")
	public ResponseEntity<String> updateFlight(@RequestBody Flights flight)
	{
		return service.updateFlight(flight);
	}
}

