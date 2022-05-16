package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>(); 
//		list.add(3); 
//		list.add(4);
//		list.add(55);
//		list.add(222);
		
		
//		for(Integer integer : list) {
//			System.out.println(integer);
//		}
//		System.out.println("--------------------------------------------");
		
		
//		Iterator<Integer> iterator = list.iterator();
		
//		while(iterator.hasNext()) {
//			Integer i = iterator.next();
//			System.out.println(i);
//		}
		
//		System.out.println("--------------------------------------------");
		
//		iterator.forEachRemaining(System.out::println);
		
		
		// exercise
		
		List<String> list2 = new ArrayList<String>();
		
		list2.add("hi"); 
		list2.add("bye");
		list2.add("foo");
		list2.add("lalala");
		

//		iterator2.forEachRemaining(System.out::println);
//		System.out.println("--------------------------------------------");
		
//		removeAllItemsFromList(list2);
		
		//first
		int start = 5; 
		int end = 15;
		System.out.println("from range function: ");
		System.out.println(range(start, end));
		
		//second
		ArrayList<Integer> inlist = range(start, end);
		
		System.out.println("from double_each function: ");
		double_each(inlist); 
		
		
	}
	


	private static void removeAllItemsFromList(List<String> list2) {
		System.out.println(list2);
		Iterator<String> iterator = list2.iterator();
		while(iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		System.out.println(list2);
	}
	
	public static ArrayList<Integer> range(int start,int end) {
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		System.out.println("at the begining: " + intArrList);
//		Iterator<Integer> iterator = intArrList.iterator();
		for(int i = 0; i <= end-start; i++) {
			intArrList.add(start+i);
		}
		System.out.println("at the end: " + intArrList);
		
		return intArrList;
	}
	
	private static void double_each(ArrayList<Integer> inlist) {
		ArrayList<Integer> newArrList = new ArrayList<Integer>();
		Iterator<Integer> iterator = inlist.iterator();
		while(iterator.hasNext()) {
			newArrList.add(iterator.next()*2);
		}
		System.out.println(newArrList);	
	}
	

}
