package drinks;
import drinksRunner.VendingMachine;

public class Chocolate extends HotDrink {
	
	enum Base{
		MILK, 
		WATER
	}
	protected Base base; 
	
	public Chocolate() {
		volume = 80;
		temperature = 70;
		price = 8; 
		sugarSpoons = 1;
		this.base = Base.valueOf("MILK");
	}
	
	@Override
	public String toString() {
		return String.format("Hot chocolate drink, with %d spoons of sugar, based on %s. \n please pay %d NIS.", sugarSpoons, base, price); 
	}
	
	public void produce() {
		if(VendingMachine.milkQtt < 80)
			System.out.println("no milk left. please refill the machine.");
		else {
			System.out.println("your drink is ready!\n" + toString() );
			VendingMachine.milkQtt -= volume;
			System.out.println("machine status: " + VendingMachine.milkQtt + " cc of milk, and " + VendingMachine.waterQtt + " cc of water.");
			System.out.println("");
		}
			
			
		
	}
}
