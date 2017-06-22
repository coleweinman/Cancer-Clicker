package Game;

public class Operation {
	private int spaceProvided = 0;
	private int cellRate = 0;
	private int moneyRate = 0;
	private double superCellMult = 0;
	
	public Operation() {
		
	}
	
	public Operation(int s) {
		spaceProvided = s;
	}
	
	public Operation(int s, int m) {
		spaceProvided = s;
		superCellMult = m;
	}
	
	public int getCellIncrease() {
		return cellRate;
	}
	
	public int getMoneyRate() {
		return moneyRate;
	}
	
	public int getSpace() {
		return spaceProvided;
	}
	
	public double getSuperCellMult() {
		return superCellMult;
	}
	
	public void setCellRate(int i) {
		cellRate = i;
	}
	
	public void setMoneyRate(int i) {
		moneyRate = i;
	}
	
	public void setSpace(int s) {
		spaceProvided = s;
	}
	
	public void setSuperCellMult(double m) {
		superCellMult = m;
	}
	
}
