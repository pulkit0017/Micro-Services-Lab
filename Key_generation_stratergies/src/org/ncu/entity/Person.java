package org.ncu.entity;

import java.util.Date;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.ncu.embedable.PersonAddress;


@Entity
@Table(name="person_table")
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int person_id;
	private String name;
	private int address;
	private Date dob;
	private int age;
	
	@Embedded
	private PersonAddress person_add;
	
	public Person( String name, int address, Date dob, int age) {
		super();
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.age = age;
	}
	
	public int getPerson_id() {
		return person_id;
	}
	
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAddress() {
		return address;
	}
	
	public void setAddress(int address) {
		this.address = address;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public PersonAddress getPerson_add() {
		return person_add;
	}

	public void setPerson_add(PersonAddress person_add) {
		this.person_add = person_add;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

}
