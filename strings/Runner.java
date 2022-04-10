package javabootcamp.oop.strings;

import java.util.Scanner;


public class Runner {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		   int selectedOption = 0;
		   while(selectedOption != 7) {
			   printMenu();
			   selectedOption = Integer.parseInt(scanner.nextLine());
			   switch (selectedOption) {
			   case 1:
				   handleOption1();
				   break; 
			   case 2:
				   handleOption2();
				   break;
			   case 3:
				   handleOption3();
				   break;
			   case 4:
				   break;
			   case 5:
				   break;
			   case 6:
				   break;
			   case 7:
				     System.out.println("Goodbye");
				   break;
			   default: 
					 System.out.println("invalid number. please try again.");
			
			   }
		   }
			   
		   
		   
		   scanner.close(); 
	}
	
	public static void printMenu() {
		String menuText = "Please enter the number of your selection from the following options:\r\n";
		menuText += "1. Enter 2 sentences and I’ll tell you if one is the other written backwards.\r\n";
		menuText += "2. Enter a word and I’ll tell you if it is a palindrome.\r\n";
		menuText += "3. Enter a sentence and a word and I’ll remove that word from anywhere in the sentence for you.\r\n";
		menuText += "4. Enter a sentence and I’ll capitalize the beginning of each word in it.\r\n";
		menuText += "5. Enter a sentence and 2 words and I’ll replace that first word with the second from everywhere in the sentence for you.\r\n";
		menuText += "6. Enter a sentence and a letter and I’ll print all the words that start with that letter.\r\n";
		menuText += "7. Exit\r\n";
		System.out.println(menuText);
		}
	//option 1
	public static void handleOption1() {
		String s1 = getInputOption1();
		String s2 = getInputOption1();
		System.out.println(isBackwardSentence(s1, s2));
	}
	
	public static String getInputOption1(){
		System.out.println("please enter a sentence:");
		String s = scanner.nextLine();
		return s; 
	}
	
	public static boolean isBackwardSentence(String s1, String s2) {
		if(s1.length() != s2.length())
			return false; 
		int stringsLength = s1.length();
		for(int i = 0; i < stringsLength; i++) {
			if(s1.charAt(i) != s2.charAt(stringsLength-1-i))
					return false; 
		}
		return true; 
	}
	
	//option 2
	public static void handleOption2() {
		   System.out.println(isWordPalindrome(getInputOption2()));
	}
	
	public static String getInputOption2(){
		   System.out.println("enter a word:");
		   String w = scanner.next(); 
		   return w; 
	}
	
	
	public static boolean isWordPalindrome(String w) {
		int wLength = w.length();
		for(int i = 0; i < wLength/2; i++) {
			if(w.charAt(i) != w.charAt(wLength-1-i))
				return false;
		}
		return true; 
	}
	
	//option 3
	public static void handleOption3() {
		String word = getWordInputOption3();
		String sentence = getSentenceInputOption3();
		System.out.println(removeWordFromSentence(word, sentence));
	}
	
	public static String getWordInputOption3(){
		   System.out.println("enter a word:");
		   String w = scanner.nextLine(); 
		   return w; 
	}
	
	public static String getSentenceInputOption3(){
		   System.out.println("enter a sentence:");
		   String s = scanner.nextLine(); 
		   return s; 
	}
	
	
	public static String removeWordFromSentence(String word, String sentence) {
		sentence = sentence.replaceAll(word, "");
		return sentence; 
	}

	

}
