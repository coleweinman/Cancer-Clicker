package Game;

import Main.Price;

public enum OperationData {
	Box(new Price(50,0,0,0),0,0,0,0,0,1),
	Garage(new Price(800,0,0,0),2,0,0,0,0,10),
	Office(new Price(4000,0,0,0),5,0,0,0,0,80),
	Cole(new Price(10000,0,0,0),200,0,0,0.2,0.2,150),
	Nhan(new Price(100000,0,0,0),30,0,0.5,0,0,100),
	School(new Price(500000,0,0,0),20,0,-0.3,-0.3,0,500);
	
	private Price p;
	private int cellCost;
	private int moneyCost;
	private double superCellMult;
	private double cellMult;
	private double moneyMult;
	private int space;
	
	OperationData(Price p, int cellCost, int moneyCost, double superCellMult, double cellMult, double moneyMult, int space) {
		this.p = p;
		this.cellCost = cellCost;
		this.moneyCost = moneyCost;
		this.superCellMult = superCellMult;
		this.cellMult = cellMult;
		this.moneyMult = moneyMult;
		this.space = space;
	}
	
	public Price getPrice() {
		return p;
	}
	
	public int getCellCost() {
		return cellCost;
	}
	
	public int getMoneyCost() {
		return moneyCost;
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
	
	public int getSpace() {
		return space;
	}
}
