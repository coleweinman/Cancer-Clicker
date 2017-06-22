package Game.Characters;

import Game.Data;
import Main.Price;

public class Amine extends Character {
	
	public Amine() {
		super("Amine");
		setCellRate(Data.Amine.getCellRate());
		setPrice(Data.Amine.getPrice());
	}
}
