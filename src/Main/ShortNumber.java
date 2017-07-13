package Main;

public class ShortNumber {
	private long number;
	private boolean really;
	private boolean doub;
	private String s = "";
	private double real;
	
	public ShortNumber(long n, boolean b) {
		number = n;
		really = b;
		doub = false;
	}
	
	public ShortNumber(double d) {
		real = d;
		number = new Double(d).intValue();
		really = false;
		doub = true;
	}
	
	public long getShort() {
		if(number >= 1000000000) {
			s = "b";
			return number/1000000000;
		}
		if(number >= 1000000) {
			s = "m";
			return number/1000000;
		}
		if(number >= 1000 && really) {
			s = "k";
			return number/1000;
		}
		return number;
	}
	
	public String toString() {
		if(!doub)
			return String.format("%,d", new Long(getShort())) + s; 
		return String.format("%,d", new Long(getShort())) + new Double(real-number).toString().substring(1) + s;
	}
}
