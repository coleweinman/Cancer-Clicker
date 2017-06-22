package Game.Characters;

import Game.Data;
import Main.Price;

public class Garrett extends Character {
	
	public Garrett() {
		super("Garrett");
		setCellRate(Data.Garrett.getCellRate());
		setPrice(Data.Garrett.getPrice());
	}
}
