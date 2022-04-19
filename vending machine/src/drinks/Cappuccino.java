package drinks;

import drinksRunner.VendingMachine;

public class Cappuccino extends Coffee{
	
	public Cappuccino(){
		volume = 150;
		price = 9; 
		sugarSpoons = 0;
		numOfShots = 2;
	}
	
	@Override
	public String toString() {
		return String.format("Hot Cappuccino drink, with %d spoons of sugar, and %d shots. \n please pay %d NIS.", sugarSpoons,numOfShots, price); 
	}
	
	@Override
	public void produce() {
		if(VendingMachine.milkQtt < 150)
			System.out.println("no water/milk left. please refill the machine.");
		else {
			System.out.println("your drink is ready!\n" + toString() );
			VendingMachine.milkQtt -= volume;
			System.out.println("machine status: " + VendingMachine.milkQtt + " cc of milk, and " + VendingMachine.waterQtt + " cc of water.");
			System.out.println("");
		}
	}

}
