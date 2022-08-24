package org.ncu.embedable;

import java.io.Serializable;

public class PersonAddress implements Serializable{
	
	private String country;
	private String city;
	private String state;
	private int pinCode;
	private String add_type;
	
	public PersonAddress(String country, String city, String state, int pinCode, String add_type) {
		super();
		this.country = country;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.add_type = add_type;
	}
	
	public PersonAddress(){}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getAdd_type() {
		return add_type;
	}

	public void setAdd_type(String add_type) {
		this.add_type = add_type;
	}

	@Override
	public String toString() {
		return "PersonAddress [country=" + country + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode
				+ ", add_type=" + add_type + "]";
	}
	
}
