package Game.Characters;

import Game.Data;
import Main.Price;

public class Daniel extends Character{
	
	public Daniel() {
		super("Daniel");
		setCellRate(Data.Daniel.getCellRate());
		setPrice(Data.Daniel.getPrice());
	}
}
