package interface_segregation;

public class Penguin implements Bird, Swimable {

    public String currentLocation;
    public int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }

//    public void fly() {
//        throw new UnsupportedOperationException();
//    }

    public void swim() {
        this.currentLocation = "in the water";
    }

}
