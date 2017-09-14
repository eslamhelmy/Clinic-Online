package com.clinic.order;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	private OrderRespository orderRepo;

	public OrderRespository getOrderRepo() {
		return orderRepo;
	}

	public void setOrderRepo(OrderRespository orderRepo) {
		this.orderRepo = orderRepo;
	}

	public List<Order> getAllOrders() {
		List<Order> orders=new ArrayList<>();
		orderRepo.findAll().forEach(orders::add);
		return orders;
	}

	public void addOrder(Order order) {
		orderRepo.save(order);
	}

	public List<Order> findOrderByPhone(String phone) {
		return orderRepo.findByPatientPhoneNumber(phone);
	}

	public void updateOrder(Order order, int orderId) {
		orderRepo.save(order);
		
	}
	
	

}
