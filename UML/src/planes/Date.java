package planes;

public class Date {
	
	int day; 
	int month; 
	int year; 
	 public Date(int day, int month, int year) {
		 
		 this.day = day; 
		 this.month = month;
		 this.year = year; 
		 
	 }
	 
	 @Override 
	 public String toString() {
		 String msg = String.format("%d/%d/%d", day, month, year);
		 System.out.println(msg);
	 }
	

}
