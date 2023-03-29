package com.jpa.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(nullable = false)
private String street;
@Column(nullable = false)
private String city;
@OneToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "person_id", nullable = false)
private Person person;
// getters and setters
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}




}