package javabootcamp.basic.ex2a;

import java.util.Scanner;

public class Runner {
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		//question 1 - ask for user's age and prints minor/adult.
		
		System.out.println("please enter your age");
		int age = scanner.nextInt();
		if (age < 18)
			System.out.println("you are a minor.");
		else
			System.out.println("you are an adult.");
		
		
		//question 3 - gets a number with 2 digits and checks if both digits identical.
		System.out.println("please enter a number with two digits");
		int num = scanner.nextInt();
		if(num/10 == num%10)
			System.out.println("the two digits of the number are identical.");
		else 
			System.out.println("the two digits of the number are NOT identical.");
		
		
		
		//question 5 - gets a number with 2 digits and checks if right digit is 
		// sequential to the left one
		System.out.println("please enter a number with two digits");
		int num = scanner.nextInt();
		String isSeq = "";
		if(num%10 != num/10+1)
			isSeq = " Not";
			
		System.out.println("the digits are"+isSeq+" sequentials");
		
		
		//question 7 - gets the size of a car's gas tank and checks if it is needed
		// to fill in gas. 
		
		System.out.println("please enter the size of your gas tank");
		float gasTank = scanner.nextFloat();
		System.out.println("please enter the amount of gas you have at the moment");
		float gasAmountNow = scanner.nextFloat();	
		if(gasAmountNow/gasTank > 0.15)
			System.out.println("no need for gas filling");
		else
			System.out.println("please fill in gas.");
		
		
		//question 9 - gets a number of 8 digits which stands for a date, and prints 
		//the year, month and day.
		
		System.out.println("please enter the date (in a 8 digits form)");
		int date = scanner.nextInt();
		int year = date % 10000;
		int month = (date / 10000) % 100;
		int day = date / 1000000;
		System.out.println("the year is: " + year
							+ ", the month is: " + month
							+ ", the day is: " + day);

	}

}
