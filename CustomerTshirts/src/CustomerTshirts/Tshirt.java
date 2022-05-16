package CustomerTshirts;

public class Tshirt {
	
	protected Design design;
	protected double demandFactor;
	protected double basePrice;
	
	protected final double MIN_DEMAND_FACTOR = 0.1; 
	protected final double MAX_DEMAND_FACTOR = 1; 
	protected final double MIN_BASE_PRICE = 3; 
	
	enum SIZE{
		XS, 
		S, 
		M,
		L,
		XL
	}
	SIZE size; 
	
	public Tshirt(double demandFactor, double basePrice, String size, 
			double width, double height, String slogan, double complexity, short red, short green, short blue) {
		design = new Design(width, height, slogan ,complexity, red, green, blue);
		setSize(size); 
		setDemandFactor(demandFactor);
		setBasePrice(basePrice);
	}
	
	public Tshirt() {
		this.design = new Design();
		this.basePrice = MIN_BASE_PRICE;
		this.demandFactor = MIN_DEMAND_FACTOR;
		setSize("M"); 
	}

	protected void setBasePrice(double basePrice) {
		if(basePrice < 3)
			this.basePrice = 3; 
		else 
			this.basePrice = basePrice; 
	}

	protected void setDemandFactor(double demandFactor) {
		if(demandFactor > MAX_DEMAND_FACTOR)
			this.demandFactor = demandFactor; 
		else if(demandFactor < MIN_DEMAND_FACTOR)
			this.demandFactor = MIN_DEMAND_FACTOR;
		else 
			this.demandFactor = demandFactor; 
	}

	protected void setSize(String size) {
		this.size = SIZE.valueOf(size);
	}
	
	public double calculateFinalPrice() {
		double finalPrice = (basePrice + design.complexity) * design.calculateArea() / demandFactor;
		return finalPrice;
	}
	
	public boolean isExpensive() {
		if(calculateFinalPrice() >= 10000 )
			return true; 
		else 
			return false;
	}
	
	@Override
	public String toString() {
		String msg = String.format("the shirt is of size %s, with demand factor of %f, and a base price of %f. colors: "
				, size, demandFactor, basePrice);
		msg += design.color.toString();
		return msg; 
	}
	
}
