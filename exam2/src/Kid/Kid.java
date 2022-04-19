package Kid;

import java.time.LocalDate;
import java.time.Period; 
/**
 * 
 * @author Shelly Foran
 *
 */
public class Kid {
	
	protected String kidName; 
	protected LocalDate birthDate;
	public int age;
	
	public Kid(String kidName, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
		setKidName(kidName);
		setBirthDate(dayOfBirth, monthOfBirth, yearOfBirth);
		LocalDate currentDate = LocalDate.now();
		age = Period.between(birthDate, currentDate).getYears();
	}
	
	private void setKidName(String kidName) {
		this.kidName = kidName; 
	}
	
	private void setBirthDate(int dayOfBirth, int monthOfBirth, int yearOfBirth) {
		birthDate = LocalDate.of(yearOfBirth, monthOfBirth,dayOfBirth);  
	}
	
	
	public String getKidName() {
		return birthDate;
	}
	
	public LocalDate getBirthDate() {
		return kidName;
	}
	
	public int getAge() {
		return age; 
	}
	
	public void pickAToy(Toy toy) {
		toy.play(age); 
	}

}

