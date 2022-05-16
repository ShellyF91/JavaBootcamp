package CustomerTshirts;

public class Design {
	
	protected double width; 
	protected double height; 	
	protected String slogan; 
	protected Color color; 
	protected double complexity; 
	
	protected final double MAX_WIDTH_IN_CM = 30; 
	protected final double MIN_WIDTH_IN_CM = 20; 
	protected final double MAX_HEIGHT_IN_CM = 25; 
	protected final double MIN_HEIGHT_IN_CM = 10;
	protected final double MAX_COMPLEXITY = 100; 
	protected final double MIN_COMPLEXITY= 1;
	
	
	public Design(double width, double height, String slogan, double complexity, short red, short green, short blue) {
		
		color = new Color(red, green, blue);
		setWidth(width);
		setHeight(height);
		setSlogan(slogan);
		setComplexity(complexity);
	}
	
	public Design() {
		color = new Color();
		this.width = MIN_WIDTH_IN_CM;
		this.height = MIN_HEIGHT_IN_CM;
		this.slogan = "";
		this.complexity = MIN_COMPLEXITY;
	}
	
	


	protected void setComplexity(double complexity) {
		if(complexity < MIN_COMPLEXITY)
			this.complexity = MIN_COMPLEXITY;
		else if(complexity > MAX_COMPLEXITY)
			this.complexity = MAX_COMPLEXITY;
		else
			this.complexity = complexity;
	}


	protected void setSlogan(String slogan) {
		boolean isLegal = true;
		for(int i = 0; i < slogan.length(); i++) {
			if( ! Character.isLetterOrDigit(slogan.charAt(i)));
				isLegal = false;
		}
		
		if(isLegal)
			this.slogan = slogan; 
		else 
			this.slogan = ""; 	
	}
	
	
	


	protected void setHeight(double height) {
		if(height < MIN_HEIGHT_IN_CM )
			this.height = MIN_HEIGHT_IN_CM;
		else if(height > MAX_HEIGHT_IN_CM)
			this.height = MAX_HEIGHT_IN_CM;
		else
			this.height = height;
	}


	protected void setWidth(double width) {
		if(width < MIN_WIDTH_IN_CM )
			this.width = MIN_WIDTH_IN_CM;
		else if(width > MAX_WIDTH_IN_CM)
			this.width = MAX_WIDTH_IN_CM;
		else
			this.width = width;
	}
	
	public double calculateArea() {
		double area = width * height; 
		return area; 
	}
	



}
