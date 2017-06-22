package Game.Characters;

import Game.Data;
import Main.Price;

public class Chris extends Character {
	private static final Price price = new Price(120000,0,5,0);
	private static final int cellRate = 50;
	
	public Chris() {
		super("Chris");
		setCellRate(Data.Chris.getCellRate());
		setPrice(Data.Chris.getPrice());
	}
}
