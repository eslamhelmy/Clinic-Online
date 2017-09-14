package com.clinic.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.order.Order;

@RestController
public class PatientController {
	@Autowired
	PatientService serv;
	
	public PatientService getServ() {
		return serv;
	}
	public void setServ(PatientService serv) {
		this.serv = serv;
	}
	@RequestMapping("/patients")
	public List<Patient> getAllPatients(){
		return serv.getAllPatients();
	}
	@RequestMapping(method=RequestMethod.POST,value="/patients")
	public void addPatient(@RequestBody Patient patient){
		serv.addPatient(patient);
	}
	public PatientController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping("/patients/name/{name}")
	public List<Patient> getPatientByName(@PathVariable String name){
		return serv.getPatientByName(name);
	}
	
	@RequestMapping("/patients/address/{address}")
	public List<Patient> getPatientByAddress(@PathVariable String address){
		return serv.getPatientByAddress(address);
	}
	
	@RequestMapping("/patients/age/{age}")
	public List<Patient> getPatientByAge(@PathVariable int age){
		return serv.getPatientByAge(age);
	}
	
	@RequestMapping("/patients/phone/{phone}")
	public Patient getPatientByPhone(@PathVariable String phone){
		return serv.getPatientByPhone(phone);
	}
	@RequestMapping(value="/patients/{phone}", method=RequestMethod.DELETE)
	public void deletePatient(String phone){
		serv.deletePhone(phone);
	}
//	@RequestMapping("/patients/{name}/orders")
//	public List<Order> getAllOrders(@PathVariable String name){
//		return serv.getAllOrders(name);
//	}
}
