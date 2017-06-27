package Game.Characters;

import Game.CharacterData;
import Main.Price;

public class Daniel extends Character{
	
	public Daniel() {
		super("Daniel");
		setCellRate(CharacterData.Daniel.getCellRate());
		setPrice(CharacterData.Daniel.getPrice());
		setSpace(getPrice().getSpace());
	}
}
