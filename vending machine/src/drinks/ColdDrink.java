package drinks;

import drinksRunner.VendingMachine;

public abstract class ColdDrink extends Drink{
	
	ColdDrink() {
		temperature = 3; 
	}

	public void produce() {

		System.out.println("your drink is ready!\n" + toString() );
		System.out.println("machine status: " + VendingMachine.milkQtt + " cc of milk, and " + VendingMachine.waterQtt + " cc of water.");
		System.out.println("");
	}

}
