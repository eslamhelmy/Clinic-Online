
package com.clinic.order;
import java.io.Serializable;
import javax.persistence.*;

import org.springframework.context.annotation.Lazy;

import com.clinic.patient.Patient;

import java.util.Date;


/**
 * The persistent class for the order database table.
 * 
 */
@Entity
//@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
@Table(name="order_patient")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private byte active;

	@Temporal(TemporalType.DATE)
	private Date day;

	private String type;

	//bi-directional many-to-one association to Patient
	@ManyToOne
	private Patient patient;

	public Order() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public Date getDay() {
		return this.day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}