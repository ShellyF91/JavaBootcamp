package exercise;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	protected String firstName; 
	protected String lastName;
	protected int age; 
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.age = age;
	}
	
	public String toString() {
		String msg = String.format("name: %s %s, age: %d", firstName, lastName, age);
		return msg;
	}
	

}
