package com.example.demo.ifaces;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TripData;

@Repository
public interface TripDataRepository extends JpaRepository<TripData, Integer> {

	// select * from tripdata where customerName ="Ram"
	
	public List<TripData> findByCustomerName(String name);
	
	// select * from tripdata where customerName ="Ram" and tripDate="12-10-2020"
	
	public List<TripData> findByCustomerNameAndTripDate(String name,LocalDate date);
	
	
}
