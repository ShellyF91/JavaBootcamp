package examples;

public class Printer implements Printable{

	public static void main(String[] args) {
		Printer printer = new Printer();
		String hello = "hello";
		
		Printable printable = new Printable() { //אנונימית
			@Override
			public void print(String s) {
				System.out.println(s);
			}
		};
		activate(printable, hello);
	}
	
	public static void activate(Printable printable, String s) {
		printable.print(s);
	}


}
