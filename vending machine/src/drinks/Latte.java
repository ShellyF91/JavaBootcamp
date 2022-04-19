package drinks;

import drinksRunner.VendingMachine;

public class Latte extends Coffee{
	
	public Latte() {
		volume = 90;
		price = 7; 
		sugarSpoons = 0;
		numOfShots = 1;
	}
	
	@Override
	public String toString() {
		return String.format("Hot Latte drink, with %d spoons of sugar, and %d shots. \n please pay %d NIS.", sugarSpoons,numOfShots, price); 
	}
	
	@Override
	public void produce() {
		if(VendingMachine.milkQtt < 90)
			System.out.println("no water/milk left. please refill the machine.");
		else {
			System.out.println("your drink is ready!\n" + toString() );
			VendingMachine.milkQtt -= volume;
			System.out.println("machine status: " + VendingMachine.milkQtt + " cc of milk, and " + VendingMachine.waterQtt + " cc of water.");
			System.out.println("");
		}
	}

}
