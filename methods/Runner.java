package javabootcamp.basic.methods;

import java.util.Scanner;
import java.lang.Math;


public class Runner {
	
	// question in class 
	public static int printMax(int num1, int num2, int num3) {
		int max; 
		if(num1 > num2) {
			if(num1 > num3)
				max = num1;
			else 
				max = num3;
		}
		else {
			if(num2 > num3)
				max = num2;
			else 
				max = num3;
		}
		
		return max;		
	}
	
	public static int printMax(int num1, int num2) {
		int max; 
		if(num1 > num2) 
			max = num1;
		else 
			max = num2;
		
		return max;		
	}
	
	// question in class 
	public static void printAvg(double grade1, double grade2, double grade3) {

		System.out.println((grade1 + grade2 + grade3)/3.0);
	}
	
	// question 1
	public static int numDigitsPlusOne(int num) {
		
		int newNum = 0;
		int tensCounter = 1; 
		for(int i = 0; num/10 > 0; i++) {
			newNum += ((num % 10 + 1)%10) * tensCounter;
			tensCounter *= 10;
			num /= 10;
		}
		newNum += ((num % 10 + 1)%10) * tensCounter;
		return newNum;
	}
	
	
	// question 2
	

	public static int numFromSmallerDigits(int num1, int num2) {
		
		int newNum = 0;
		int tensCounter = 1; 
		//creating new number
		for(int i = 0; num1/10 > 0 || num2/10 > 0; i++) {
			if(num1%10 < num2%10)
				newNum += (num1%10)*tensCounter;
			else
				newNum += (num2%10)*tensCounter;
			
			tensCounter *= 10;
			num1 /= 10;
			num2 /= 10;
		}
		//checking different length
		if(num1/10 > 0 || num2/10 > 0)
			newNum = -1;
		//adding last digit
		else {
			if(num1%10 < num2%10)
				newNum += (num1%10)*tensCounter;
			else
				newNum += (num2%10)*tensCounter;
		}
		return newNum;
	}
	
	
	// question 3
	
	public static boolean isPerfectNumber(int num) {
		int sum = 0;
		boolean result; 
		
		for(int i = 1; i < num; i++) {
			if(num % i == 0)
				sum += i;
		}

		if(sum == num)
			result = true; 
		else 
			result = false; 
		
		return result;
	}
	
	// question 4
	
	public static int sumOfDigits(int num) {
		int sum = 0; 
		while(num/10 > 0) {
			sum += num%10;
			num /= 10; 
		}
		sum += num%10;
		return sum; 
	}
	
	public static int numOfElementsWithSumOfDigits10(int [] arr, int l) {
		int counter = 0; 
		for(int i = 0; i < l; i++) {
			if(sumOfDigits(arr[i]) == 10)
				counter++;
		}
		return counter;
	}
	
	// question 5
	
	public static void printsRhombusFrame(char ch, int num) {
		//prints upper part
		for(int i = num; i > 1; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print(ch);
			}
			for(int k = 0; k < num-i; k++) {
				System.out.print(" ");
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print(ch);
			}
			
			System.out.println();
		}
		//prints lower part
		for(int i = 1; i <= num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(ch);
			}
			for(int k = 0; k < num-i; k++) {
				System.out.print(" ");
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print(ch);
			}
			
			System.out.println();
		}
	}
		
	
	
	// question 6
	public static boolean isEqualSumRowsColumns(int mat[][]) {
		boolean result = true; 
		for(int i = 0; i < mat.length; i++) {
			if(sumOfColumn(mat, i) != sumOfRow(mat, i)) {
				result = false; 
				break; 
			}
		}
		return result; 
	}
	
	public static int sumOfColumn(int mat[][], int c) {
		int sum = 0; 
		for(int i = 0; i < mat.length; i++) {
			sum += mat[i][c]; 
		}
		return sum; 
	}
	
	public static int sumOfRow(int mat[][], int r) {
		int sum = 0; 
		for(int i = 0; i < mat.length; i++) {
			sum += mat[r][i]; 
		}
		return sum; 
	}
	
	
	// question 7
	
	public static boolean isMirrorMatrix(int mat[][], int rows, int columns) {
		boolean result = true; 
		for(int i = 0; i < columns/2; i++) {
			for(int j = 0; j < rows; j++) {
				if(mat[j][i] != mat[j][columns-1-i])
					result = false;
			}
		}
		return result; 
	}
	
	
	
	// question 8
	
	public static int [] sumArrayOf2NumArrays(int arr1[], int arr2[]) {
		int num1 = extractNumFromArray(arr1); 
		int num2 = extractNumFromArray(arr2); 
		int sum = num1 + num2; 
		int [] sumArr = createArrayFromNum(sum);
		return sumArr;
	}
	
	public static int extractNumFromArray(int arr[]) {
		int tensCounter = 1; 
		for(int i = 2; i <= arr.length; i++)
			tensCounter *= 10; 
		
		int num = 0; 
		for(int i = 0; i < arr.length; i++) {
			num += arr[i] * tensCounter; 
			tensCounter /= 10;
		}
		return num; 
	}
	
	public static int [] createArrayFromNum(int num) {
		
		int counter = 0;
		int numToDivide = num; 
		do {
			counter++;
			numToDivide /= 10;
		} while (numToDivide > 0);
		
		int [] arr = new int [counter]; 
		for(int i = counter-1; i >= 0; i--) {
			arr[i] = num%10; 
			num /= 10; 
		}
		return arr; 
	}
	
	
	// question 9
	
	public static int max0Rectangle(int mat[][]) {
		int max = 0;
		for(int i = 0; i < mat.length; i++) {
			if(mat[i][i] == 0) {
				for(int j = 0; j <= i; j++) {
					if(mat[i][j] == 0 && mat[j][i] != 0)
						max++;
				}	
			}

		}
		
	}
	
	
	
	// question 11
	
	// from class 
//	public static int [] CrateAnArrayOfRandomInts(int l) {
//		int [] arr = new int [l]; 
//		for(int i = 0; i < l; i++) {
//			arr[i] = 
//		}
//		return arr; 
//	}
	
	// from class 
	public static int sumOfElements(int n1, int n2) {
		return n1+n2;
	}
	public static void biggerArrayToSum(int [] arr1, int [] arr2) {
		int [] smaller; 
		int [] bigger;
		if(arr1.length > arr2.length) {
			smaller = arr2;
			bigger = arr1;
		}
		else {
			smaller = arr1;
			bigger = arr2;
		}
		for(int i = 0; i < smaller.length; i++)
			bigger[i] = sumOfElements(arr1[i],arr2[i]);
		

	}
	

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("please enter 3 grades:");
//		int grade1, grade2, grade3;
//		grade1 = scanner.nextInt();
//		grade2 = scanner.nextInt();
//		grade3 = scanner.nextInt();
//		scanner.close(); 
//		printAvg(grade1, grade2, grade3);
//		int result = printMaxOf3(1,2,3);
//		System.out.println(result);
//question 1
//		int result = numDigitsPlusOne(1234);
//		System.out.println(result);
//question 2
//		int result = numFromSmallerDigits(20,12);
//		System.out.println(result);
//question 3
//		for(int i = 1; i <= 10000; i++) {
//			if( isPerfectNumber(i) == true)
//				System.out.println(i + " is a perfect number");
//		}
//question 4		
//		System.out.println(sumOfDigits(123));
//		int [] a = {1,2,3,11,7,8,55,64,37,10};
//		System.out.println(numOfElementsWithSumOfDigits10(a ,10));
//question 5
//		printsRhombusFrame('#',4);
	
//question 6
//	int [][] mat = {{2,1,5}, {6,7,3}, {0,8,0}}; 
//	System.out.println(isEqualSumRowsColumns(mat));
	
//question 7
//	int [][] mat = {{1,8,3,2,1},{1,2,6,2,1},{1,2,7,2,1}};
//	System.out.println(isMirrorMatrix(mat, 3, 5));

//question 8
		
//		int [] arr = createArrayFromNum(123); 
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);

//		int [] arr = {1,2,3};
//		int a = extractNumFromArray(arr);
//		System.out.println(a);
		
//	int [] arrNum1 = {1,2,3};
//	int [] arrNum2 = {1,1,1};
//	int [] resultArr= sumArrayOf2NumArrays(arrNum1, arrNum2);
//	System.out.print(resultArr[0]);
//	System.out.print(resultArr[1]);
//	System.out.print(resultArr[2]);
		

		
//question 9

		
//question 11
		
	// from class
		
//		double ex1 = 10 * Math.sin(Math.PI/4);
//		System.out.println(ex1);
//		double ex2 = Math.toRadians(120);
//		System.out.println(ex2);
//		double ex3 = Math.E
		
	// from class	
		int [] a1 = {1,2,3};
		int [] a2 = {1,2,3,4};
		biggerArrayToSum(a1,a2);
		System.out.println(a2[3]);
			
		}
	}

	
}
