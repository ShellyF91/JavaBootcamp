package drinks;

import drinks.Soda.Container;
/**
 * 
 * @author foran
 *
 */
public class Orange extends Soft{

	public Orange(){
		volume = 200;
		price = 10;
		type = Type.valueOf("SQUEEZED");
	}

	@Override
	public String toString() {
		return String.format("Cold Orange drink, of type %s. \n please pay %d NIS.",type, price); 
	}

}
