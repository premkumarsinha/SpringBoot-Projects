package com.prem.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prem.demo.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer> {

	@Query(value="select * from booking where pid=:pid and fid=:fid",nativeQuery=true)
	Booking findPassenger(int pid, int fid);

}
