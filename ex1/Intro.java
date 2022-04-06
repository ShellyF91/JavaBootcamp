package javabootcamp.basic.ex1;

import java.util.Scanner;

public class Intro {
	
	
	public static void main(String[] args) {
		
		// ex 1  - gets a radius and prints the p and the s of the circle 
		
		Scanner scanner = new Scanner(System.in); 
		
		/*
		final float PI = 3.14f; 
		System.out.println("please enter a radius");
		float radius = scanner.nextFloat();
		float p = 2 * radius * PI; 
		float s = radius * radius * PI; 
		System.out.println("p = " + p);
		System.out.println("s = " + s);
		
		
		// ex 2 - asks toast data and calculate it's price
		
		final int basicToastPrice = 12; 
		final int cheapExtra = 2; 
		final int expensiveExtra = 3; 
		int numOfExpensiveExtras, numOfCheapExtras, totalPrice; 
		System.out.println("please enter the number of expensive extras you would like to have in your toast");
		numOfExpensiveExtras = scanner.nextInt();
		System.out.println("please enter the number of cheap extras you would like to have in your toast");
		numOfCheapExtras = scanner.nextInt();
		totalPrice = basicToastPrice 
					+ numOfExpensiveExtras * expensiveExtra 
					+ numOfCheapExtras * cheapExtra;
		System.out.println("the price of your toast is " + totalPrice + " NIS.");

		// ex 3 
		
		
		
		
		// class ex. - flow control 
		int num; 
		System.out.println("please enter an integer number:");
		num = scanner.nextInt();
		if(num%3==0 && num%4==0) {
			System.out.println(num + " is dividable by 2,3 and 4.");
		}
		else {
			System.out.println(num + " is NOT dividable by 2,3 and 4.");
		}
		System.out.println("Goodbye");
		
		String result = (num%12==0)? "indeed " : "not";
		System.out.println(num + "is " + result + "dividable by 2,3 and 4. ");
	
		
		// gets 3 numbers, checks if the first is in the range between the two others. 
		
		int num1, num2, num3; 
		System.out.println("please enter 3 integer numbers, press enter between them");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		if(num1 > num2 && num1 < num3) {
			System.out.println(num1 + " is in the range " + num2 + " to " + num3);
		}
		else if (num1 < num2 && num1 > num3) {
			System.out.println(num1 + " is in the range " + num3 + " to " + num2);
		scanner.close(); 
		}
		else if(num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is greater than "+ num2 + " and " + num3);
		}
		else if(num1 < num2 && num1 < num3) {
			System.out.println(num1 + " is smaller than "+ num2 + " and " + num3);
			}
			*/
		
		
		// exercise switch case - gets a year and a month from the user and returns 
		// the month's name and number of days (in that specific year).  
		System.out.println("please enter a month's number:");
		int month = scanner.nextInt();
		System.out.println("please enter a year:");
		int year = scanner.nextInt();
		if(month < 1 || month > 12) {
			System.out.println("invalid month");
			return;
		}
		if(year < 0) {
			System.out.println("invalid year");
			return;
		}
		int febDays = 28; 
		if ((year - 2020) % 4 == 0)
			febDays = 29; 
		
		switch(month) {
			case 1:
				System.out.println("January - 31 days");
				break;
			case 2:
				System.out.println("February - " + febDays + " days");	
				break;
			case 3:
				System.out.println("March - 31 days");	
				break;
			case 4:
				System.out.println("April - 30 days");	
				break;
			case 5:
				System.out.println("May - 31 days");	
				break;
			case 6:
				System.out.println("June - 30 days");	
				break;
			case 7:
				System.out.println("July - 31 days");	
				break;
			case 8:
				System.out.println("August - 31 days");	
				break;
			case 9:
				System.out.println("September - 30 days");	
				break;
			case 10:
				System.out.println("October - 31 days");	
				break;
			case 11:
				System.out.println("November - 30 days");	
				break;
			case 12:
				System.out.println("December - 31 days");	
				
		}
		
	}	
		
}
	
	
