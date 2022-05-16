package planes;

public class Hour {
	
	 int hourDeparture;
	 int minutesDeparture;
	 
	 public Hour(int hourDeparture, int minutesDeparture) {
		 this.hourDeparture = hourDeparture;
		 this.minutesDeparture = minutesDeparture;
	 }
	
	 @Override 
	 public String toString() {
		 String msg = String.format("%d:%d", hourDeparture, minutesDeparture);
		 System.out.println(msg);
	 }

}
