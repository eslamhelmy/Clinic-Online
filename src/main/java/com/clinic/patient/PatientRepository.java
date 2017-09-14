package com.clinic.patient;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.clinic.order.Order;

public interface PatientRepository extends CrudRepository<Patient, Integer>{
	public List<Patient> findByName(String name);
	public List<Patient> findByAddress(String address);
	public List<Patient> findByAge(int age);
//	public List<Order> findByOrders(String name);
	public Patient findByPhoneNumber(String phone);
	
	
}
