package Game.Operations;

import Main.Price;

public class Operation {
	private int spaceProvided = 0;
	private int cellRate = 0;
	private int moneyRate = 0;
	private int cellCost = 0;
	private int moneyCost = 0;
	private double superCellMult = 0;
	private double cellMult = 0;
	private double moneyMult = 0;
	private String type = "";
	private Price p;
	
	public Operation(String t) {
		type = t;
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
	
	public int getMoneyCost() {
		return moneyCost;
	}
	
	public int getCellCost() {
		return cellCost;
	}
	
	public double getSuperCellMult() {
		return superCellMult;
	}
	
	public double getCellMult() {
		return cellMult;
	}
	
	public double getMoneyMult() {
		return moneyMult;
	}
	
	public String getType() {
		return type;
	}
	
	public Price getPrice() {
		return p;
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
	
	public void setMoneyCost(int c) {
		moneyCost = c;
	}
	
	public void setCellCost(int c) {
		cellCost = c;
	}
	
	public void setSuperCellMult(double m) {
		superCellMult = m;
	}
	
	public void setCellMult(double c) {
		cellMult = c;
	}
	
	public void setMoneyMult(double m) {
		moneyMult = m;
	}
	
	public void setType(String t) {
		type = t;
	}
	
	public void setPrice(Price p) {
		this.p = p;
	}
	
}
