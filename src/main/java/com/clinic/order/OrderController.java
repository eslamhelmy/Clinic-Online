package com.clinic.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.patient.Patient;
import com.clinic.patient.PatientRepository;

@RestController
public class OrderController {
	@Autowired
	private OrderService orderServ;
	@Autowired
	private PatientRepository serv;
	
	public OrderService getOrderServ() {
		return orderServ;
	}

	public void setOrderServ(OrderService orderServ) {
		this.orderServ = orderServ;
	}
	@RequestMapping("/orders")
	public List<Order> getAllOrders(){
		return orderServ.getAllOrders();
	}
	@RequestMapping(value="/patients/{phone}/orders", method=RequestMethod.POST)
	public void addOrder(@RequestBody Order order, @PathVariable String phone){
		Patient patient = serv.findByPhoneNumber(phone);
		order.setPatient(patient);
		orderServ.addOrder(order);
	}
	@RequestMapping("/orders/phone/{phone}")
	public List<Order> getOrderByPhone(@PathVariable String phone){
		return orderServ.findOrderByPhone(phone);
	}
}
