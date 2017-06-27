package Game;

import Main.Price;

public enum CharacterData {
	Brian(new Price(100,0,0,10),1,0,0),
	Garrett(new Price(800,0,0,8),2,0,0),
	Noah(new Price(4000,0,0,6),5,0,0),
	Andrew(new Price(10000,0,0,4),10,0,0),
	Daniel(new Price(100000,0,0,2),50,0,0),
	Amine(new Price(500000,0,0,1),100,0,0),
	Chris(new Price(1000000,0,0,1),250,0,0),
	Tinky(new Price(1000000000,0,10,1),1000,0,0);
	
	private Price p;
	private int cellRate;
	private int moneyRate;
	private double superCellMult;
	
	CharacterData(Price p, int cellRate, int moneyRate, int superCellMult) {
		this.p = p;
		this.cellRate = cellRate;
		this.moneyRate = moneyRate;
		this.superCellMult = superCellMult;
	}
	
	public Price getPrice() {
		return p;
	}
	
	public int getCellRate() {
		return cellRate;
	}
	
	public int getMoneyRate() {
		return moneyRate;
	}
	
	public double getSuperCellMult() {
		return superCellMult;
	}
}
