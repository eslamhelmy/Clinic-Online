package com.clinic.order;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OrderRespository extends CrudRepository<Order, Integer>{
	
	public List<Order> findByPatientPhoneNumber(String phone);
}
