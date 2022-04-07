package javabootcamp.basic.exam;

public class Runner {
	
	// question 1 
	/* {JDK{JRE{JVM}}}
	 * JDK - Java Development Kit. the software development environment needed for developing in java. it includes JRE, and 
	 *       development tools such as javac, jheap and jconsole,
	 * JRE - Java Runtime Environment. the basic requirements for execution of a java program. it includes java's class library and 
	 *       JDK.  
	 * JVM - Java Virtual Machine. the IDE, which execute the code line by line. 
	 */
	
	// question 2
	/* code written in an editor -> .java source file -> javac -> bytecode .class file -> java -> output
	 * first, Java files are  compiled to bytecode files ending in .class.
	 * To run the java program the JRE instantiate a JVM in the host memory.
	 * the byte code converts to a specific local machine code.
	*/
	
	// question 3 
	public static boolean isPalindrome(int num) {
		
		int flippedNum = 0; 
		int originalNum = num; 
		boolean isNumPalindrome = true; 

		while(num/10 > 0) {
			flippedNum += num%10; 
			flippedNum *= 10; 
			num /= 10; 
		}
		flippedNum += num%10;
	
		if(originalNum != flippedNum)
			isNumPalindrome = false;
		
		return isNumPalindrome;
	}
	
	// question 4
	public static int[] newArrayFromTwoArraysOrderedBySumAndTotalSumAndDelta(int[] arr1, int[] arr2) { 
		int sumOfArr1 = SumOfArray(arr1);
		int sumOfArr2 = SumOfArray(arr2);
		int [] smallerSumArray = arr1;
		int [] largerSumArray = arr2;
		int smallerSum = sumOfArr1;
		int largerSum = sumOfArr2; 
		
		//checks which array's sum is smaller and which is larger
		if(sumOfArr1 > sumOfArr2) {
			smallerSumArray = arr2;
			largerSumArray = arr1;
			smallerSum = sumOfArr2;
			largerSum = sumOfArr1;
		}
		
		int newArr[] = new int[smallerSumArray.length + largerSumArray.length + 2];
		int i; 
		
		//puts the array with the smaller sum into the new array
		for (i = 0; i < smallerSumArray.length; i++) 
			newArr[i] = smallerSumArray[i];
		//puts the array with the larger sum into the new array
		for( ; i < newArr.length - 2; i++) 
			newArr[i] = largerSumArray[i - smallerSumArray.length];
		//puts the total sum and the delta of sums at the end of the new array
		newArr[i] = sumOfArr1 + sumOfArr2;
		newArr[i+1] = largerSum - smallerSum; 
		
		return newArr; 
	}
	
	public static int SumOfArray(int arr[]) {
		int sum = 0; 
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i]; 
		}
		return sum; 
	}
	
	public static void PrintArray(int arr[]) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + "  ");
		System.out.println("]");
	}


	public static void main(String[] args) {
		
		// question 3
		System.out.println(isPalindrome(1234321));
		System.out.println(isPalindrome(123321));
		System.out.println(isPalindrome(123421));
		System.out.println(isPalindrome(1));
		
		// question 4
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {1,2,100};
		PrintArray(newArrayFromTwoArraysOrderedBySumAndTotalSumAndDelta(arr1,arr2));

	}

}
