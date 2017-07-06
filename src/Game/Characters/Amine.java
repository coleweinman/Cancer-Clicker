package Game.Characters;

import Game.CharacterData;
import Main.Price;

public class Amine extends Character {
	
	public Amine() {
		super("Amine");
		setCellRate(CharacterData.Amine.getCellRate());
		setPrice(CharacterData.Amine.getPrice());
		setSpace(CharacterData.Amine.getSpace());
	}
}
