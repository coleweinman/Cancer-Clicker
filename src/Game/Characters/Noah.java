package Game.Characters;

import Game.Data;
import Main.Price;

public class Noah extends Character {
	private static final Price price = new Price(1000,0,0,0);
	private static final int cellRate = 4;
	
	public Noah() {
		super("Noah");
		setCellRate(Data.Noah.getCellRate());
		setPrice(Data.Noah.getPrice());
	}
}
