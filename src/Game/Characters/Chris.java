package Game.Characters;

import Game.CharacterData;
import Main.Price;

public class Chris extends Character {
	
	public Chris() {
		super("Chris");
		setCellRate(CharacterData.Chris.getCellRate());
		setPrice(CharacterData.Chris.getPrice());
		setSpace(CharacterData.Chris.getSpace());
	}
}
