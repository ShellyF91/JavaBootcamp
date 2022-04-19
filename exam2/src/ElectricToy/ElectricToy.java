package ElectricToy;

import Toy.Toy;

public class ElectricToy extends Toy{
	
	protected int numOfBatteries; 
	protected int sound; 
	
	public ElectricToy(String toyName, int purchaseDay, int purchaseMonth, int purchaseYear, int numOfBatteries, int sound) {
		super(toyName ,purchaseDay, purchaseMonth,  purchaseYear);
		setNumOfBatteries(numOfBatteries);
		setSound(sound); 
	}
	
	private void setNumOfBatteries(int numOfBatteries){
		this.numOfBatteries = numOfBatteries; 
	}
	
	private void setSound(int sound) {
		if(sound > 3)
			this.sound = 3; 
		else if(sound < 0)
			this.sound = 0; 
		else
			this.sound = sound; 
	}
	
	@Override 
	public void play(int age) {
		super.play(age);
		if(sound > 0)
			sound--; 
	}

}
