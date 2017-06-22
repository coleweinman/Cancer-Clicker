package Game;

import Main.Price;

public enum Data {
	Brian(new Price(100,0,0,0),1,0,0,0),
	Garrett(new Price(800,0,0,0),2,0,0,0),
	Noah(new Price(4000,0,0,0),5,0,0,0),
	Andrew(new Price(10000,0,0,0),10,0,0,0),
	Daniel(new Price(100000,0,0,0),50,0,0,0),
	Amine(new Price(500000,0,0,0),100,0,0,0),
	Chris(new Price(1000000,0,0,0),250,0,0,0),
	Tinky(new Price(1000000000,0,10,0),1000,0,0,0);
	
	private Price p;
	private int cellRate;
	private int moneyRate;
	private double superCellMult;
	private int space;
	
	Data(Price p, int cellRate, int moneyRate, int superCellMult, int space) {
		this.p = p;
		this.cellRate = cellRate;
		this.moneyRate = moneyRate;
		this.superCellMult = superCellMult;
		this.space = space;
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
	
	public int getSpace() {
		return space;
	}
}
