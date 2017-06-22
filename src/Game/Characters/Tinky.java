package Game.Characters;

import Game.Data;

public class Tinky extends Character {
	
	public Tinky() {
		super("Tinky");
		setCellRate(Data.Tinky.getCellRate());
		setPrice(Data.Tinky.getPrice());
	}
}
