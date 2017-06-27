package Game.Characters;

import Game.CharacterData;
import Main.Price;

public class Noah extends Character {
	private static final Price price = new Price(1000,0,0,0);
	private static final int cellRate = 4;
	
	public Noah() {
		super("Noah");
		setCellRate(CharacterData.Noah.getCellRate());
		setPrice(CharacterData.Noah.getPrice());
	}
}
