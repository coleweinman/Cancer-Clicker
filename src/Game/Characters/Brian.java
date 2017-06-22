package Game.Characters;

import Game.Data;
import Main.Price;

public class Brian extends Character {
	
	public Brian() {
		super("Brian");
		setCellRate(Data.Brian.getCellRate());
		setPrice(Data.Brian.getPrice());
	}
}
