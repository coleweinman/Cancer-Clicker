package Game;

public class ShortNumber {
	private long number;
	private boolean really;
	private String s = "";
	
	public ShortNumber(long n, boolean b) {
		number = n;
		really = b;
	}
	
	public long getShort() {
		if(number > 1000000000) {
			s = "b";
			return number/1000000000;
		}
		if(number > 1000000) {
			s = "m";
			return number/1000000;
		}
		if(number > 1000 && really) {
			s = "k";
			return number/1000;
		}
		return number;
	}
	
	public String toString() {
		return String.format("%,d", new Long(getShort())) + s; 
	}
}
