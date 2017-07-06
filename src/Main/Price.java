package Main;

public class Price {
	private int cells;
	private int money;
	private int superCell;
	
	public Price(int c, int m, int sc) {
		cells = c;
		money = m;
		superCell = sc;
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
}
