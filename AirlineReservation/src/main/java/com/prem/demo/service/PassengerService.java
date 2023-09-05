package com.prem.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.prem.demo.dao.AirlineRepository;
import com.prem.demo.dao.BookingRepository;
import com.prem.demo.dao.PassengerRepository;
import com.prem.demo.model.Booking;
import com.prem.demo.model.Flights;
import com.prem.demo.model.Passenger;
import com.prem.demo.model.SearchTemplate;
import com.prem.demo.model.Ticket;

@Service
public class PassengerService {

	@Autowired
	PassengerRepository repo;
	@Autowired
	AirlineRepository repo1;
	@Autowired
	BookingRepository repo2;
	public ResponseEntity<String> addPassenger(Passenger p) {
		try {
		repo.save(p);
		return new ResponseEntity<>("Record added successfully",HttpStatus.CREATED);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return new ResponseEntity<>("Record couldn't be created",HttpStatus.BAD_REQUEST);
	}
	public ResponseEntity<List<Flights>> searchFlights(SearchTemplate template) {
		try{
			List<Flights> li=repo1.findByTemplate(template.getDate(),template.getDlocation(),template.getAlocation());
		return new ResponseEntity<>(li,HttpStatus.OK);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
	}
	public ResponseEntity<String> updatePassenger(Passenger p) {
		
		try {
		repo.save(p);
		return new ResponseEntity<>("Recorded Updated",HttpStatus.OK);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return new ResponseEntity<>("Recorded not updated",HttpStatus.BAD_REQUEST);
	}
	public ResponseEntity<String> bookTickets(int pid, int fid) {
		try {
		Passenger p=repo.findById(pid).get();
		Flights f=repo1.findById(fid).get();
		Booking b=new Booking(p.getPid(),p.getPname(),p.getAge(),f.getFid(),f.getAirlines(),f.getDate(),f.getDlocation(),f.getAlocation());
		repo2.save(b);
		Booking book=repo2.findPassenger(pid,fid);
		return new ResponseEntity<>("tickets booked and your booking id is "+book.getBid(),HttpStatus.OK);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return new ResponseEntity<>("Tickets couldn't be booked",HttpStatus.BAD_REQUEST);
	}
	public ResponseEntity<String> deleteBooking(int bid) {
		try {
		Booking b=repo2.findById(bid).get();
		repo2.deleteById(bid);
		return new ResponseEntity<>("Booking id "+b.getBid()+" has been cancelled",HttpStatus.OK);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return new ResponseEntity<>("Booking couldn't be deleted",HttpStatus.BAD_REQUEST);
	}
	public ResponseEntity<String> deletePassenger(int pid) {
		try {
		repo.deleteById(pid);
		return new ResponseEntity<>("Passenger id :"+pid+" has been deleted",HttpStatus.OK);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return new ResponseEntity<>("Passenger couldn't be deleted",HttpStatus.BAD_REQUEST);
	}
	public ResponseEntity<Ticket> generateTicket(int bid) {
		try {
		Booking b=repo2.findById(bid).get();
		
		Ticket t=new Ticket(b.getBid(),b.getName(),b.getAge(),b.getAirlines(),b.getDate(),b.getDlocation(),b.getAlocation());
		
		return new ResponseEntity<>(t,HttpStatus.OK);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		return new ResponseEntity<>(new Ticket(),HttpStatus.BAD_REQUEST);
	}
	
	

}
