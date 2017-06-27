package Game.Characters;

import Game.CharacterData;
import Main.Price;

public class Garrett extends Character {
	
	public Garrett() {
		super("Garrett");
		setCellRate(CharacterData.Garrett.getCellRate());
		setPrice(CharacterData.Garrett.getPrice());
	}
}
