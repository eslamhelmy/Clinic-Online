package com.clinic.patient;
import java.io.Serializable;
import javax.persistence.*;

import com.clinic.order.Order;

import java.util.List;


/**
 * The persistent class for the patient database table.
 * 
 */
@Entity
//@NamedQuery(name="Patient.findAll", query="SELECT p FROM Patient p")
@Table(name="patieent")
public class Patient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String address;

	private int age;

	private String email;

	private String gender;

	private String name;

	@Column(name="phone_number")
	private String phoneNumber;

//	//bi-directional many-to-one association to Order
//	@OneToMany(mappedBy="patient")
//	private List<Order> orders;

	public Patient() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

//	public List<Order> getOrders() {
//		return this.orders;
//	}
//
//	public void setOrders(List<Order> orders) {
//		this.orders = orders;
//	}

//	public Order addOrder(Order order) {
//		getOrders().add(order);
//		order.setPatient(this);
//
//		return order;
//	}
//
//	public Order removeOrder(Order order) {
//		getOrders().remove(order);
//		order.setPatient(null);
//
//		return order;
//	}

}