package Game.Characters;

import Game.CharacterData;
import Main.Price;

public class Chris extends Character {
	private static final Price price = new Price(120000,0,5,0);
	private static final int cellRate = 50;
	
	public Chris() {
		super("Chris");
		setCellRate(CharacterData.Chris.getCellRate());
		setPrice(CharacterData.Chris.getPrice());
		setSpace(getPrice().getSpace());
	}
}
