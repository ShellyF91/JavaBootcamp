package fileExamples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Runner {

	public static void main(String[] args) throws IOException {
		
		countingWords();
		countingLines();
		textFromGivenLine(18);
		printWordByIndex(578);
	}
	
	public static void countingWords() throws IOException{
		 String line;  
	     int count = 0;  
	     try( FileReader file = new FileReader("myFiles/alice.txt");  
	    	  BufferedReader br = new BufferedReader(file);  ){
	    	 while((line = br.readLine()) != null) {  
	    		 String words[] = line.split(" ");
	    		 count = count + words.length;  
	    	 }
	    	 System.out.println("Number of words present in alice: " + count);   
	     }
	     catch(FileNotFoundException e){
	    	 System.out.println(e);
	     }
	}
	
	public static void countingLines() throws IOException{	
		 String line;  
	     int count = 0;  
	     try( FileReader file = new FileReader("myFiles/alice.txt");  
	    	  BufferedReader br = new BufferedReader(file);  ){
	    	 while((line = br.readLine()) != null) {  
	    		 count++;  
	    	 }
	    	 System.out.println("Number of lines present in alice: " + count);   
	     }
	     catch(FileNotFoundException e){
	    	 System.out.println(e);
	     }
	}
	
	public static void textFromGivenLine(int lineNumber) throws IOException{	
		 String line = "";   
	     try( FileReader file = new FileReader("myFiles/alice.txt");  
	    	  BufferedReader br = new BufferedReader(file);  ){
	    	 for(int i = 0; i < 18; i++) {  
	    		 line = br.readLine();
	    	 }
	    	 System.out.println("line number " + lineNumber + " = " + line);   
	     }
	     catch(FileNotFoundException e){
	    	 System.out.println(e);
	     }
	}
	
	
	public static void printWordByIndex(int wordNumber) throws IOException{
		 String line;  
	     int count = 0;  
	     try( FileReader file = new FileReader("myFiles/alice.txt");  
	    	  BufferedReader br = new BufferedReader(file);  ){
	    	 while((line = br.readLine()) != null) {  
	    		 String words[] = line.split(" ");
	    		 for(int i = 0; i < words.length; i++) {
	    			 count++; 
	    			 if(count == wordNumber) {
	    				 System.out.println("the " + wordNumber + " word is " + words[i]);
	    				 break;
	    			 }
	    		 }
	    		 
	    	 }  
	     }
	     catch(FileNotFoundException e){
	    	 System.out.println(e);
	     }
	}
	
	

}
