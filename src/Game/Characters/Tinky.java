package Game.Characters;

import Game.CharacterData;

public class Tinky extends Character {
	
	public Tinky() {
		super("Tinky");
		setCellRate(CharacterData.Tinky.getCellRate());
		setPrice(CharacterData.Tinky.getPrice());
		setSpace(getPrice().getSpace());
	}
}
