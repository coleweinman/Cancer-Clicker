package Game;

public class Character {
	
	private int cellInc = 0;
	private int moneyInc = 0;
	private boolean puppet = false;
	private double superCellMult = 0;
	
	public Character() {
		
	}
	
	public int getCellIncrease() {
		return cellInc;
	}
	
	public int getMoneyIncrease() {
		return moneyInc;
	}
	
	public boolean isPuppet() {
		return puppet;
	}
	
	public void setCellIncrease(int i) {
		cellInc = i;
	}
	
	public void setMoneyIncrease(int i) {
		moneyInc = i;
	}
	
	public void setPuppet(boolean b) {
		puppet = b;
	}
}
