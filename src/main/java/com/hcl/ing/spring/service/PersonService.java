package com.hcl.ing.spring.service;

import java.util.List;

import com.hcl.ing.spring.entity.Person;

public interface PersonService {
	
	public void addPerson(Person p);

	public void updatePerson(Person p);

	public List<Person> listPersons();

	public Person getPersonById(int id);

	public void removePerson(int id);
}
