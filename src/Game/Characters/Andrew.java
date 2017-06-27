package Game.Characters;

import Game.CharacterData;
import Main.Price;

public class Andrew extends Character {
	
	public Andrew() {
		super("Andrew");
		setCellRate(CharacterData.Andrew.getCellRate());
		setPrice(CharacterData.Andrew.getPrice());
	}
}
