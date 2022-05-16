package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {


	public static void main(String[] args) {
		
		List<Person> listOfPeople = Arrays.asList(
				new Person("Shelly", "Foran", 30),
				new Person("Eran", "Krivine", 35),
				new Person("Karin", "Blum", 34),
				new Person("Yoel", "Blum", 37),
				new Person("Emma", "Blum", 2)); 
				
		//print them
		listOfPeople.forEach(person -> System.out.println(person));
		
		
		//sort by last name
		Collections.sort(listOfPeople, (person1, person2) -> person1.lastName.compareTo(person2.lastName));
		System.out.println("");
		System.out.println("sorted by last name:");
		listOfPeople.forEach(person -> System.out.println(person));
		
		//print the people who don't have the letter 'o' in their first name
		System.out.println("");
		System.out.println("people without the letter 'o' in their first name:");
		listOfPeople.forEach(person -> { 
							if( ! person.firstName.contains("o") && ! person.firstName.contains("O"))
								System.out.println(person);
		});
		
		//print a new list of people under the age of 21
		List<Person> listOfMinors = new ArrayList<>();
		listOfPeople.forEach(person -> { 
							if( person.age < 21)
								listOfMinors.add(person);
		});
		System.out.println("");
		System.out.println("people under the age of 21:");
		listOfMinors.forEach(person -> System.out.println(person));
		
		

		
	}	

	

}
