package exam3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

public class Runner {
	
	public static Random random = new Random(); 

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Food food1 = new Food("tofu", "UMAMI", "PROTEIN");
		Food food2 = new Food("bamba", "SALTY", "FAT");
		
		Dragon dragon1 = new Dragon("Drogon", 1,1,860,10);
		Dragon dragon2 = new Dragon("Viserion", 1,1,900,8);
		
		printToFileRandomObjectOf4(food1, food2, dragon1, dragon2);
		printToFileRandomObjectOf4(food1, food2, dragon1, dragon2);
		
		printFileOfObjects();		
	}
	
	public static void printToFileRandomObjectOf4(Food food1, Food food2, Dragon dragon1, Dragon dragon2) throws FileNotFoundException, IOException {
		
		try (FileOutputStream fileOut = new FileOutputStream("myFiles/objectFile.dat");
				ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {
			int result = random.nextInt(4)+1;
			switch(result) {
				case 1: 
					objOut.writeObject(food1);
					break; 
				case 2:
					objOut.writeObject(food2);
					break; 
				case 3: 
					objOut.writeObject(dragon1);
					break;
				case 4: 
					objOut.writeObject(dragon2);
			}
		}	
	}
	
	
	public static void printFileOfObjects() throws FileNotFoundException, IOException, ClassNotFoundException{
		try (FileInputStream file = new FileInputStream("myFiles/objectFile.dat");
				
				ObjectInputStream objStream = new ObjectInputStream(file);) {
			System.out.println("in file : " + objStream.readObject());

		}
	}	
}
