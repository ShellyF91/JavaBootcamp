package javabootcamp.basic.ex3;

import java.util.Scanner;


public class Runner {
	

	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//question 3 - calculates a wedding gift 
//		
//		boolean isFamily, isCloseFriend, isMoreThan3years, isDriveMoreThan1Hour;
//		int wedGift;
//		System.out.println("Please reply 'true' or 'false' to each of the following statements, regarding your acquaintance with the happy couple.");
//		System.out.println();
//		System.out.println("You are a family member. type 'true' or 'false' below:"); 
//		//calculate the value of the wedding gift 
//		isFamily = scanner.nextBoolean();
//		if (isFamily == true) {
//			wedGift = 1000; 
//		}
//		else {
//			System.out.println("You are a close friend. type 'true' or 'false' below:"); 
//			isCloseFriend = scanner.nextBoolean();
//			if(isCloseFriend == true) 
//				wedGift = 500;
//			
//			else
//				wedGift = 250;
//			
//			System.out.println("You know each other more than 3 years. type 'true' or 'false' below:");
//			isMoreThan3years = scanner.nextBoolean();
//			if(isMoreThan3years == true)
//				wedGift += 50;
//			
//			System.out.println("The drive to the wedding will take you more than an hour. type 'true' or 'false' below:");
//			isDriveMoreThan1Hour = scanner.nextBoolean();
//			if(isDriveMoreThan1Hour == true)
//				wedGift -= 50;
//		}
//		
//		System.out.println("Your wedding gift should be " + wedGift + " NIS.");
//		
		//question 7 - calculates a final grade 
		
		int examGrade, avgGradeExercises, numOfExercises;
		final int EXAM_PASS_GRADE = 55; 
		final int EX_GRADE_FOR_MAGEN = 80;
		double totalGrade = 0; 
		
		//input from user
		System.out.println("Please enter your exam's grade:");
		examGrade = scanner.nextInt();
		System.out.println("Please enter the number of exercises you have submitted:");
		numOfExercises = scanner.nextInt();
		System.out.println("Please enter the average of the grades of your exercises:");
		avgGradeExercises = scanner.nextInt();
		//grade calculation
		switch (numOfExercises) {
		
			case 0: 
			case 1: 
			case 2: 
			case 3: 
			case 4: 
				totalGrade = 0; 
				break; 
			case 5: 
			case 6: 
				if(examGrade >= EXAM_PASS_GRADE)
					totalGrade = 0.2*avgGradeExercises + 0.8*examGrade;
				else
					totalGrade = examGrade;
				break; 
			case 7: 
			case 8: 
				double gradeWithMagen;
				if(examGrade >= EXAM_PASS_GRADE) 
					gradeWithMagen = 0.3*avgGradeExercises + 0.7*examGrade;
				else {
					if(avgGradeExercises >= 80)
						gradeWithMagen = 0.25*avgGradeExercises + 0.75*examGrade;
					else
						gradeWithMagen = 0.2*avgGradeExercises + 0.8*examGrade;
				}
				
				//checks magen
				if(gradeWithMagen > examGrade)
					totalGrade = gradeWithMagen;
				else
					totalGrade = examGrade;
		}
		
		System.out.println("Your final grade is: " + totalGrade);
			
	
	}
	

}
