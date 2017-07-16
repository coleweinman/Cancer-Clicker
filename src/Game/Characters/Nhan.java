package Game.Characters;

import Game.CharacterData;
import Game.Operations.Operation;
import Main.Price;

public class Nhan extends Character {
	
	public Nhan() {
		super("Nhan");
		setPrice(CharacterData.Nhan.getPrice());
		setSpace(CharacterData.Nhan.getSpace());
	}
	
	@Override
	public void setOperation(Operation o) {
		super.setOperation(o);
		o.setCellMult(o.getCellMult()+0.05);
		o.setCellMult(o.getMoneyMult()+0.05);
		o.setCellMult(o.getSuperCellMult()+0.05);
	}
}
