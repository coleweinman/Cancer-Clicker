package Game.Characters;

import Game.CharacterData;
import Main.Price;

public class Jake extends Character {
	
	public Jake() {
		super("Jake");
		setPrice(CharacterData.Jake.getPrice());
		setSpace(CharacterData.Jake.getSpace());
	}
	
	@Override
	public void action() {
		getOperation().setCellCost(0);
	}
}
