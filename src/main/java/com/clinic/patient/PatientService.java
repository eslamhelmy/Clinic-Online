package com.clinic.patient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.order.Order;
@Service
public class PatientService {
	@Autowired
	PatientRepository patientRepo;
	
	public PatientRepository getPatientRepo() {
		return patientRepo;
	}

	public void setPatientRepo(PatientRepository patientRepo) {
		this.patientRepo = patientRepo;
	}

	public List<Patient> getAllPatients() {
		List<Patient> patients=new ArrayList<Patient>();
		patientRepo.findAll().forEach(patients::add);
		return patients;
	}

	public void addPatient(Patient patient) {
		patientRepo.save(patient);
		
	}

	public List<Patient> getPatientByName(String name) {
		return patientRepo.findByName(name);
	}

	public List<Patient> getPatientByAddress(String address) {
		return patientRepo.findByAddress(address);
	}
	
	public List<Patient> getPatientByAge(int age) {
		return patientRepo.findByAge(age);
	}

	public Patient getPatientByPhone(String phone) {
		return patientRepo.findByPhoneNumber(phone);
	}

//	public List<Order> getAllOrders(String name) {
//		return patientRepo.findByOrders(name);
//	}
}
