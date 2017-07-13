package Game.Characters;

import Game.Operations.Operation;
import Main.Price;

public class Character {
	
	private String type = "";
	private int cellRate = 0;
	private int moneyRate = 0;
	private double cellMult = 0;
	private double moneyMult = 0;
	private boolean puppet = false;
	private double superCellMult = 0;
	private int space = 0;
	private static Price price;
	private int cellCost = 0;
	private int moneyCost = 0;
	private Operation operation;
	
	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation o) {
		operation = o;
		o.add(this);
	}

	public void action() {
		
	}

	public int getCellCost() {
		return cellCost;
	}

	public void setCellCost(int cellCost) {
		this.cellCost = cellCost;
	}

	public int getMoneyCost() {
		return moneyCost;
	}

	public void setMoneyCost(int moneyCost) {
		this.moneyCost = moneyCost;
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
	
	public int getSpace() {
		return space;
	}
	
	public double getSuperCellMult() {
		return superCellMult;
	}
	
	public int getMoneyRate() {
		return moneyRate;
	}
	
	public static Price getPrice() {
		return price;
	}
	
	public double getCellMult() {
		return cellMult;
	}
	
	public double getMoneyMult() {
		return moneyMult;
	}
	
	public boolean isPuppet() {
		return puppet;
	}	
	
	public void setCellRate(int i) {
		cellRate = i;
	}
	
	public void setSuperCellMult(double m) {
		superCellMult = m;
	}
	
	public void setMoneyRate(int i) {
		moneyRate = i;
	}
	
	public void setPuppet(boolean b) {
		puppet = b;
	}
	
	public void setPrice(Price p) {
		price = p;
	}
	
	public void setSpace(int i) {
		space = i;
	}
	
	public void setCellMult(double m) {
		cellMult = m;
	}
	
	public void setMoneyMult(double m) {
		moneyMult = m;
	}
}