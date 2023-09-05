package com.prem.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prem.demo.model.Flights;
import com.prem.demo.model.SearchTemplate;

@Repository
public interface AirlineRepository extends JpaRepository<Flights, Integer> {

	/*@Query(value="select * from flights where fdate=:date",nativeQuery=true)
	List<Flights> findByDate(String date);*/

	@Query(value="select * from flights where fdate=:date and dlocation=:dlocation and alocation=:alocation",nativeQuery=true)
	List<Flights> findByTemplate(String date,String dlocation,String alocation);

}
