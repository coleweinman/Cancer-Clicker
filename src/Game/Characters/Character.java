package Game.Characters;

public class Character {
	
	private String type = "";
	private int cellRate = 0;
	private int moneyRate = 0;
	private boolean puppet = false;
	private double superCellMult = 0;
	private int space = 0;
	
	public Character() {
		
	}
	
	public Character(String t) {
		type = t;
	}
	
	public String getType() {
		return type;
	}
	
	public boolean isType(String t) {
		if(type == t)
			return true;
		return false;
	}
	
	public int getCellRate() {
		return cellRate;
	}
	
	public int getMoneyRate() {
		return moneyRate;
	}
	
	public boolean isPuppet() {
		return puppet;
	}	
	
	public void setCellRate(int i) {
		cellRate = i;
	}
	
	public void setMoneyRate(int i) {
		moneyRate = i;
	}
	
	public void setPuppet(boolean b) {
		puppet = b;
	}
}