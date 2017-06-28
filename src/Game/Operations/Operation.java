package Game.Operations;

import java.util.ArrayList;
import java.util.List;

import Game.Characters.Character;
import Main.Price;

public class Operation {
	private List<Character> characters = new ArrayList<Character>();
	private int space = 0;
	private int capacity = 0;
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
		return space;
	}
	
	public int getCapacity() {
		return capacity;
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
		space = s;
	}
	
	public void setCapacity(int c) {
		capacity = c;
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
	
	public void add(Character c) {
		characters.add(c);
		System.out.println("Before: " + space);
		calcSpace();
		System.out.println("After: " + space);
		c.setCellMult(c.getCellMult()+cellMult);
		c.setMoneyMult(c.getMoneyMult()+moneyMult);
		c.setSuperCellMult(c.getSuperCellMult()+superCellMult);
	}
	
	public void calcSpace() {
		int sum = 0;
		for(Character c : characters)
			sum += c.getSpace();
		space = sum;
	}
	
	public List<Character> getCharacters() {
		return characters;
	}
	
}
