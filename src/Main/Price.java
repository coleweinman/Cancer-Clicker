package Main;

public class Price {
	private int cells;
	private int money;
	private int superCell;
	private int space;
	
	public Price(int c, int m, int sc, int space) {
		cells = c;
		money = m;
		superCell = sc;
		this.space = space;
	}
	
	public int getCells() {
		return cells;
	}
	
	public int getMoney() {
		return money;
	}
	
	public int getSuperCell() {
		return superCell;
	}
	
	public int getSpace() {
		return space;
	}
}
