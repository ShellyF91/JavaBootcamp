package examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Runner {

	public static void main(String[] args) {
		

	}
	
	public static void runExamples() {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		Stream<Integer> myStream = list.stream();
		Function<Integer, Integer> square = x -> x*x; 
		Stream<Integer> squared = myStream.map(square);
		squared.forEach(System.out::println);
		
	}
	
	
	

}
