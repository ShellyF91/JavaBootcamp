package exam3;

import java.io.Serializable;
import java.time.LocalDate;

public class Dragon implements Serializable{
	
	protected String name;
	protected LocalDate birthDate; 
	protected int flameIntensity;
	protected final int MIN_INTENSITY = 0; 
	protected final int MAX_INTENSITY = 10;
	
	public Dragon(String name, int day, int month, int year, int flameIntensity) {
		
		this.name = name; 
		birthDate = LocalDate.of(year, month, day);
		this.flameIntensity = flameIntensity;
	}
	
	public String toString() {
		String msg = "name: " + name + ", " + "date of birth: " + birthDate + ", " + "flame intensity: " + flameIntensity + ".";
		return msg; 
	}
	
	protected void setBirthDate() throws TooYoungException {
		if(birthDate.isAfter(LocalDate.of(888, 8, 8))) {
			throw new TooYoungException();
		}
		
	}
	

}
