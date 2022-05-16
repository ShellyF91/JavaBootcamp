package interface_segregation;

public class Eagle implements Bird, Flyable {
	
    public String currentLocation;
    public int numberOfFeathers;

    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }
    
    public void fly() {
        this.currentLocation = "in the air";
    }


}
