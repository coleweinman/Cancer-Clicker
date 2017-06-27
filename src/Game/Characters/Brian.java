package Game.Characters;

import Game.CharacterData;
import Main.Price;

public class Brian extends Character {
	
	public Brian() {
		super("Brian");
		setCellRate(CharacterData.Brian.getCellRate());
		setPrice(CharacterData.Brian.getPrice());
		setSpace(getPrice().getSpace());
	}
}
