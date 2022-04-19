package Toy;
import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;


public class Toy {
	
	public String toyName; 
	protected LocalDate purchaseDate; 
	protected final UUID SERIAL_NUMBER; 
	protected boolean isBroken; 
	enum AgeGroup {
		  A,
		  B,
		  C
		}
	AgeGroup ageGroup;

	public Toy(String toyName, int purchaseDay, int purchaseMonth, int purchaseYear) {
		SERIAL_NUMBER = UUID.randomUUID();
		setToyName(toyName);
		setPurchaseDate(purchaseDay, purchaseMonth, purchaseYear);
		setIsBroken(); 
	}
	
	private void setToyName(String toyName){
		this.toyName = toyName;
		
	}
	
	private void setPurchaseDate(int purchaseDay, int purchaseMonth, int purchaseYear) {
		purchaseDate = LocalDate.of(purchaseYear, purchaseMonth,purchaseDay);
	}
	
	private void setIsBroken() {
		
		isBroken = false; 
		LocalDate currentDate = LocalDate.now();
		if( (Period.between(purchaseDate, currentDate).getYears() ) >= 1)
			isBroken = true; 
	}
	
	private void setAgeGroup(String ageGroup) {

		this.ageGroup = AgeGroup.valueOf(ageGroup);
	}
	
	@Override
	public String toString() {
		return String.format("toy's name: %s, purchase year: %d", toyName, purchaseDate.getYear());
	}
	
	public void play(int age) {
		
		System.out.println(toString());
		boolean canPlay = false; 
		if(isBroken)
			System.out.println("The toy is not available.");
		else
			switch(ageGroup) {
			case A:
				if(age <= 1)
					canPlay = true; 
				break; 
			case B:
				if(age <= 4 && age >= 2)
					canPlay = true; 
				break; 
			case C:
				if(age <= 10 && age >= 5)
					canPlay = true; 
			}
		
		if(canPlay)
			System.out.println("You can play with the toy. enjoy!");
		else 
			System.out.println("The toy is not for your age. please pick another one.");
		
	}
	
	
}


