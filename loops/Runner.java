package javabootcamp.basic.loops;

import java.util.Scanner;

public class Runner {
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*
		//gets digits and returns an integer number 
		int digit = 0; 
		int numFromDigits = 0; 
		System.out.println("please enter digits. enter a negative number to stop");
		
		do {
			numFromDigits += digit; 
			numFromDigits *= 10;
			digit = scanner.nextInt();
		}while(digit >= 0);
			
		numFromDigits /= 10;
		System.out.println(numFromDigits);
		*/
		
		//gets single digits and multiply them 
		int digit = 0; 
		int productOfDigits = 1;
		System.out.println("please enter digits");
		digit = scanner.nextInt();
		
		while(digit > 0) {
			productOfDigits *= digit;
			digit = scanner.nextInt();
		}
		
		if(digit == 0) 
			productOfDigits = 0;
		
		System.out.println(productOfDigits);
		
		scanner.close(); 
	

	}

}
