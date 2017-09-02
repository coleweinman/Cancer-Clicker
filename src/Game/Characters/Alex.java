package Game.Characters;

import Game.CharacterData;
import Game.Operations.Operation;
import Main.Price;

public class Alex extends Character {
	
	public Alex() {
		super("Alex");
		setPrice(CharacterData.Alex.getPrice());
		setSpace(CharacterData.Alex.getSpace());
	}
	
	@Override
	public void action() {
		
	}
}
