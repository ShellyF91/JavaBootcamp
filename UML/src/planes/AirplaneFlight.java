package planes;

public class AirplaneFlight {
	
	public int flightNum;
	public Hour departureTime;
	public Date departureDate; 
	public int flightDuration;
	public Hour arrivalTime;
	protected FrequentFlyer [] frequentflyer = new FrequentFlyer [200];
	
	public AirplaneFlight(int flightNum, int hourDeparture, int minutesDeparture, int dayDate, int monthDate, int yearDate, int flightDuration) {
		this.flightNum = flightNum;
		departureTime = new Hour(hourDeparture, minutesDeparture);
		departureDate = new Date(dayDate, monthDate, yearDate); 
		this.flightDuration = flightDuration;
	}
	
	@Override
	 public String toString() {
		 String msg = String.format("flight number %d will departe at %s, %s, and will arrive at %s", flightNum, departureTime, departureDate, arrivalTime);
		 System.out.println(msg);
	 }
	
	public int delay(int minDelay) {
		
	}
	
	public String updateDestination() {
		
	}
	

}
