package drinks;

import drinksRunner.VendingMachine;

public class Espresso extends Coffee{
	
	public Espresso(){
		volume = 50;
		price = 5; 
		sugarSpoons = 0;
		numOfShots = 1;
	}
	
	@Override
	public String toString() {
		return String.format("Hot espresso drink, with %d spoons of sugar, and %d shots. \n please pay %d NIS.", sugarSpoons,numOfShots, price); 
	}
	
	@Override
	public void produce() {
		if(VendingMachine.waterQtt < 50)
			System.out.println("no water left. please refill the machine.");
		else {
			System.out.println("your drink is ready!\n" + toString() );
			VendingMachine.waterQtt -= volume;
			System.out.println("machine status: " + VendingMachine.milkQtt + " cc of milk, and " + VendingMachine.waterQtt + " cc of water.");
			System.out.println("");
		}
	}		

}
