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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prem.demo.model.Flights;
import com.prem.demo.model.Passenger;
import com.prem.demo.model.SearchTemplate;
import com.prem.demo.model.Ticket;
import com.prem.demo.service.PassengerService;

@RestController
@RequestMapping("passenger")
public class PassengerController {

	@Autowired
	PassengerService service;
	@PostMapping("add")
	public ResponseEntity<String> addPassenger(@RequestBody Passenger p)
	{
		return service.addPassenger(p);
	}
	
	@DeleteMapping("deletePassenger/{pid}")
	public ResponseEntity<String> deletePassenger(@PathVariable int pid)
	{
		return service.deletePassenger(pid);
	}
	@GetMapping("search")
	public ResponseEntity<List<Flights>> searchFlights(@RequestBody SearchTemplate template)
	{
		return service.searchFlights(template);
	}
	
	@PutMapping("update")
	public ResponseEntity<String> updatePassenger(@RequestBody Passenger p)
	{
		return service.updatePassenger(p);
	}
	
	@PostMapping("bookticket")
	public ResponseEntity<String> bookTickets(@RequestParam int pid,int fid)
	{
		return service.bookTickets(pid,fid);
	}
	
	@DeleteMapping("delete/{bid}")
	public ResponseEntity<String> deleteBooking(@PathVariable int bid)
	{
		return service.deleteBooking(bid);
	}
	
	@GetMapping("generate/{bid}")
	public ResponseEntity<Ticket> generateTicket(@PathVariable int bid)
	{
		
		return service.generateTicket(bid);
	}
}
