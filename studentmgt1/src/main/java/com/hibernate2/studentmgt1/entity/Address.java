package com.hibernate2.studentmgt1.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	//instance variable
	  
	@Id
    @GeneratedValue
    private int aid;
	private String hno;
	private String area;
	private String city;
	private String state;
	private String pin;
	//parameterized constructor
	public Address(String hno, String area, String city, String state, String pin) {
		super();
		this.hno = hno;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	//default constructor
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", area=" + area + ", city=" + city + ", state=" + state + ", pin=" + pin + "]";
	}
	
}
