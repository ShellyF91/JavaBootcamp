package drinks;

public class Cola extends Soda{
	
	public Cola () {
		volume = 200;
		price = 10;
		container = Container.valueOf("CAN");
	}  
	
	@Override
	public String toString() {
		return String.format("Cola in a %s. \n please pay %d NIS.",container, price); 
	}

}
