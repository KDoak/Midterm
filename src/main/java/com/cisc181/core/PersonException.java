package com.cisc181.core;

public class PersonException extends Exception {
	//Attribute
	Person Person;
	//Constructor
	public PersonException() {
	    }
	public PersonException(Person person) {
		super();
		this.Person = person;
	}
	//Getter for Exception
	public Person getPerson() {
		return Person;
	}

}
