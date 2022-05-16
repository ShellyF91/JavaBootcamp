package exam3;

public class NonCapatilizedException extends Exception{
	
	private String name;

	public NonCapatilizedException() {
		super();
		this.name = "name does not start with a capital letter.";
	}

	public String getName() {
		return name;
	}

}
