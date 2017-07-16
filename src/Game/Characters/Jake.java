package Game.Characters;

import Game.CharacterData;
import Game.Operations.Operation;
import Main.Price;

public class Jake extends Character {
	
	public Jake() {
		super("Jake");
		setPrice(CharacterData.Jake.getPrice());
		setSpace(CharacterData.Jake.getSpace());
	}
	
	@Override
	public void setOperation(Operation o) {
		super.setOperation(o);
		o.setCellCost(0);
	}
}
