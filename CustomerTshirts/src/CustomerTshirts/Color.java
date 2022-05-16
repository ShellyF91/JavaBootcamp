package CustomerTshirts;

public class Color {
	
	protected short red; 
	protected short green; 
	protected short blue; 
	protected static  final short MAX_VALUE; 
	protected static final short MIN_VALUE; 
	
	static {
		MAX_VALUE= 255;
		MIN_VALUE= 0;
	}
	
	
	public Color(short red, short green, short blue) {
		setRed(red); 
		setGreen(green);
		setBlue(blue); 
	}
	
	public Color() {
		this(MIN_VALUE, MIN_VALUE, MIN_VALUE);
	}
	
	
	protected void setRed(short red) {
		if(red > MAX_VALUE)
			this.red = MAX_VALUE;
		else if(red < MIN_VALUE)
			this.red = MIN_VALUE;
		else
			this.red = red; 
	}
	
	protected void setGreen(short green) {
		if(green > MAX_VALUE)
			this.green = MAX_VALUE;
		else if(green < MIN_VALUE)
			this.green = MIN_VALUE;
		else
			this.green = green;  
	}
	
	protected void setBlue(short blue) {
		if(blue > MAX_VALUE)
			this.blue = MAX_VALUE;
		else if(blue < MIN_VALUE)
			this.blue = MIN_VALUE;
		else
			this.blue = blue;  
	}
	
	public short getRed() {
		return red;
	}
	
	public short getGreen() {
		return green;
	}
	
	public short getBlue() {
		return blue;
	}
	public String toString() {
		String msg = String.format("red = %d, green = %d, blue = %d",red, green, blue);
		return msg;
	}
	
	public String getDominant() {
		int maxField = Math.max(red, green);
		maxField = Math.max(maxField, blue);
		String result = "";
		if (maxField == red)
			 result = "red"; 
		if (maxField == green)
			 result = "green"; 
		if (maxField == blue)
			 result = "blue"; 
		return result;
	}
	
	public float[] normalized() {
		float [] rgbValues = new float[3]; 
		rgbValues[0] = (float)red/MAX_VALUE; 
		rgbValues[1] = (float)green/MAX_VALUE;
		rgbValues[2] = (float)blue/MAX_VALUE;
		return rgbValues;
	}
	
	
}



