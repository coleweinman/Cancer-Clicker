package Game.Characters;

import Game.Data;
import Main.Price;

public class Andrew extends Character {
	
	public Andrew() {
		super("Andrew");
		setCellRate(Data.Andrew.getCellRate());
		setPrice(Data.Andrew.getPrice());
	}
}
