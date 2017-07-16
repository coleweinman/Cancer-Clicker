package Main;

import java.io.Serializable;

public class Price implements Serializable {
	private static final long serialVersionUID = 1L;
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
