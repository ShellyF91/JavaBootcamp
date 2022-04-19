package Doll;

import Toy.Toy;

public class Doll extends Toy{
	
	protected boolean isSoft; 
	protected int dirtiness; 
	
	public Doll(String toyName, int purchaseDay, int purchaseMonth, int purchaseYear, boolean isSoft) {
		
		super(toyName ,purchaseDay, purchaseMonth,  purchaseYear);
		setIsSoft(isSoft);
		setDirtiness(dirtiness);
	}
	
	private void setIsSoft(boolean isSoft) {
		this.isSoft = isSoft;
	}
	
	private void setDirtiness(int dirtiness) {
		this.dirtiness = 1;
 
	}
	
	@Override
	public void play(int age) {
		super.play(age);
		if (dirtiness < 10)
			dirtiness++;	
	}

}
