package exam3;

import java.io.Serializable;

public class Food implements Serializable{
	
	protected String name; 
	enum Taste{
		SWEET,
		SOUR,
		SALTY,
		BITTER,
		UMAMI
	}
	Taste taste; 
	enum Macronutrients{
		PROTEIN,
		CARBOHYDRATE,
		FAT
	}
	Macronutrients macronutrients;
	
	public Food(String name, String taste, String macronutrients) {
		this.name = name; 
		this.macronutrients = Macronutrients.valueOf(macronutrients);
		this.taste = Taste.valueOf(taste);
	}
	
	@Override
	public String toString() {
		String msg = "name: " + name + ", " + "taste: " + taste + ", " + "macronutrients: " + macronutrients + ".";
		return msg;
	}
	
	public boolean isDessert() {
		
		if(macronutrients == Macronutrients.CARBOHYDRATE && taste == Taste.SWEET)
			return true; 
	
		return false; 
	}
	
	protected void setName() throws NonCapatilizedException {
		if( ! Character.isUpperCase(name.charAt(0))) {
			throw new NonCapatilizedException();
		}
		
	}
	
	

}
