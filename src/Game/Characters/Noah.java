package Game.Characters;

import Game.CharacterData;
import Main.Price;

public class Noah extends Character {
	
	public Noah() {
		super("Noah");
		setCellRate(CharacterData.Noah.getCellRate());
		setPrice(CharacterData.Noah.getPrice());
		setSpace(CharacterData.Noah.getSpace());
	}
}
