package drinks;

import drinks.Soft.Type;

public class Apple extends Soft {
	
	public Apple(){
		volume = 200;
		price = 10;
		type = Type.valueOf("SQUEEZED");
	}
	
	
	@Override
	public String toString() {
		return String.format("Cold Apple drink, of type %s. \n please pay %d NIS.",type, price); 
	}
}
