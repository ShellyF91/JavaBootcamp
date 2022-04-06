package javabootcamp.basic.arrays;

import java.util.Scanner;

public class Runner {
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
//
//		// question from presentation
//		
//		int [] originalArr = {1,2,3,4,5}; 
//		int [] arrCopy = new int[5];
//		for(int i = 0; i < 5; i++) {
//			arrCopy[i] = originalArr[i]*originalArr[i];
//		}
//		
//		//print 
//		for(int k = 0; k < 5; k++) {
//			System.out.print(originalArr[k]); 
//		}
//		System.out.println();
//		for(int m = 0; m<5; m++) {
//			System.out.print(arrCopy[m]); 
//		}
//		System.out.println();
//		
		// question 1 - gets integers into 2 arrays of size 5, and prints if equal in opposite direction
		
//		int[] arr1 = new int[5]; 
//		int[] arr2 = new int[5]; 
//		int arrLength = arr1.length; 
//		//input from user
//		System.out.println("please enter 5 integer numbers, separated by the Enter key:");
//		for(int i = 0; i < arrLength; i++) {
//			arr1[i] = scanner.nextInt();
//		}
//		System.out.println("please enter 5 integer numbers, separated by the Enter key:");
//		for(int i = 0; i < arrLength; i++) {
//			arr2[i] = scanner.nextInt();
//		}
//		//check if equal in opposite direction
//		boolean isEqualOpp = true; 
//		for(int i = 0; i < arrLength/2; i++) {
//			if(arr1[i] != arr2[arrLength-1-i]) {
//				isEqualOpp = false;
//				break;
//			}
//		}
//
//		String result = ""; 
//		if(isEqualOpp == false)
//			result = "NOT ";
//
//		System.out.println("the arrays are " + result + "equal in opposite direction.");
//		
		
//		//question 3
		
//		int[] arr = new int[10]; 
//		System.out.println("please enter 2 integer numbers, saparated by ENTER:");
//		arr[0] = scanner.nextInt();
//		arr[1] = scanner.nextInt();
//		
//		for(int i = 2; i < 10; i++) 
//			arr[i] = arr[i-1] + arr[i-2];
//		
//		for(int i = 0; i < 10; i++) 
//			System.out.print(arr[i] + " ");
//			
		
		//question 5
//		
//		int[] arr1 = new int[5]; 
//		int[] arr2 = new int[5]; 
//		int arrLength = arr1.length; 
//		
//		//input from user
//		System.out.println("please enter 5 integer numbers, separated by the Enter key:");
//		for(int i = 0; i < arrLength; i++) {
//			arr1[i] = scanner.nextInt();
//		}
//		System.out.println("please enter 5 integer numbers, separated by the Enter key:");
//		for(int i = 0; i < arrLength; i++) {
//			arr2[i] = scanner.nextInt();
//		}
//		//checking right shift 
//		boolean isShiftRight = true; 
//		
//		if(arr2[0] != arr1[arrLength-1])
//			isShiftRight = false; 
//		else {
//			for(int i = 1; i < arrLength; i++) {
//				if(arr2[i] != arr1[i-1]) {
//					isShiftRight = false;
//					break; 
//				}		
//			}
//		}
//		
//		System.out.println("shift right is " + isShiftRight);
						    
			
		
		//question 7
//		
//		int[] arr1 = new int[5]; 
//		int[] arr2 = new int[5]; 
//		int[] arr3 = new int[5];
//		int arrLength = arr1.length; 
//		//input from user
//	    System.out.println("please enter 5 integer numbers, separated by the Enter key, in ascending order:");
//		for(int i = 0; i < arrLength; i++) {
//			arr1[i] = scanner.nextInt();
//		}
//		System.out.println("please enter 5 integer numbers, separated by the Enter key, in ascending order:");
//		for(int i = 0; i < arrLength; i++) {
//			arr2[i] = scanner.nextInt();
//		}
//		//checking which and how many values are in both arrays
//		int counter = 0; 
//		int i = 0, j = 0, k = 0; 
//		while( i < arrLength && j < arrLength) {
//			if(arr1[i] == arr2[j]) {
//				counter++;
//				arr3[k] = arr1[i];
//				System.out.print(arr3[k] + " ");
//				i++; 
//				j++; 
//				k++;
//			}
//			else {
//				if(arr1[i] > arr2[j]) 
//					j++; 
//				else 
//					i++;
//			}				
//		}
//		
//		System.out.println();
//		System.out.println(counter);
		
		//question 9
//		
//		int[] arr1 = new int[3]; 
//		int[] arr2 = new int[3]; 
//		// gets input from user
//	    System.out.println("please enter 3 integer numbers, separated by the Enter key");
//		for(int i = 0; i < 3; i++) {
//			arr1[i] = scanner.nextInt();
//		}
//		System.out.println("please enter 3 integer numbers, separated by the Enter key");
//		for(int i = 0; i < 3; i++) {
//			arr2[i] = scanner.nextInt();
//		}
//		// checks if the sum of digits is equal in matching elements
//		boolean isDigitsSumEqual = true; 
//		for(int i = 0; i < 3; i++) {
//			int sum1 = 0, sum2 = 0; 
//		
//			while(true) {
//				if(arr1[i]/10 > 0) {
//					sum1 += arr1[i]%10;
//					arr1[i]/=10;
//				}
//				else {
//					sum1 += arr1[i]%10;
//					break;
//				}	
//			}
//			
//			while(true) { 
//				if(arr2[i]/10 > 0) {
//					sum2 += arr2[i]%10;
//					arr2[i]/=10;
//				}
//				else {
//					sum2 += arr2[i]%10;
//					break;
//				}
//			}
//			if(sum2 != sum1) {
//				isDigitsSumEqual = false;
//				break;
//			}
//			
//		}
//		
//		System.out.println("sums of digits are equal in matching elements? - " + isDigitsSumEqual);
		
	// question 11
		
		
		
	// question 15
		
		int matSize;
		// gets input
		System.out.println("Please enter the size of the square matrix");
		matSize = scanner.nextInt();
		int [][] mat = new int[matSize][matSize];
		for(int i = 0; i < matSize; i++) {
			System.out.println("Row number " + i + " :");
			System.out.println("Please enter " + matSize + " numbers:");
			for(int j = 0; j < matSize; j++) {
				mat[i][j] = scanner.nextInt();
			}
		}
		//checks if the matrix is "main folded"
		boolean isMainFolded = true; 
		for(int i = 0; i < matSize; i++) {
			for(int j = 0; j < matSize; j++) {
				if(mat[i][j] != mat [j][i]) {
					isMainFolded = false;
					break;
				}	
			}
		}
		//prints the check's result; 
		String result; 
		if(isMainFolded == true)
			result = ""; 
		else
			result = "NOT";
		System.out.println("the matrix is " + result + " 'main folded'.");
		
	
	}

}
