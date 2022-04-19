package Runner;

import java.util.Iterator;

import Doll.Doll;
import ElectricToy.ElectricToy;
import Kid.Kid;
import Toy.Toy;

public class Runner {

	public static void main(String[] args) {
		
		Toy [] toys = new Toy[4]; 
		toys[0] = new ElectricToy("car", 4, 11, 2020,  2,  3);
		toys[1] = new ElectricToy("train", 20, 1, 2022,  1,  2);
		toys[2] = new Doll("barbie", 20, 2, 2021, false);
		toys[3] = new Doll("bear", 20, 3, 2022, true);
		
		for (int i = 0; i < 4; i++){
			System.out.println(toys[i]);
		}
		
		Kid kid = new Kid("Eran", 1, 1, 2021);
		
		for (int i = 0; i < 4; i++){
			toys[i].play(kid.age);
		}
		

	}

}
