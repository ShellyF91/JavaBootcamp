package drinks;

import drinks.Soda.Container;
import drinksRunner.VendingMachine;

public class Sprite extends Soda{
	
	public Sprite() {
		
		volume = 200;
		price = 10;
		container = Container.valueOf("BOTTLE");
		   
	}
	
	@Override
	public String toString() {
		return String.format("Sprite in a %s. \n please pay %d NIS.",container, price); 
	}
	



}
