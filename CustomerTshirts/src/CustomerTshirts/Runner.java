package CustomerTshirts;

public class Runner {

	public static void main(String[] args) {
		Tshirt [] shirts = new Tshirt[3];
		for(int i = 0; i < 3; i++) {
			shirts[i] = new Tshirt();
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(shirts[i].toString());
		}

	}

}
