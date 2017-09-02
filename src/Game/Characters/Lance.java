package Game.Characters;

import java.util.Random;

import Game.CharacterData;
import Game.Operations.Operation;
import Main.Price;

public class Lance extends Character {
	
	public Lance() {
		super("Lance");
		setPrice(CharacterData.Lance.getPrice());
		setSpace(CharacterData.Lance.getSpace());
	}
	
	@Override
	public void action() {
		int time = 0;
		int action = 0;
		if(Main.Game.getTime() == 1) {
			time++;
			if(time == 10) {
				action = new Random().nextInt(2);
			}
		}
		switch(action) {
			case 0: cell(); break;
			case 1: money(); break;
			case 2: superCell(); break;
		}
	}
	
	public void cell() {
		getOperation().setCellMult(0.3);
		getOperation().setMoneyCost(2);
	}
	
	public void money() {
		getOperation().setMoneyMult(0.3);
		getOperation().setCellCost(100);
	}
	
	public void superCell() {
		getOperation().setSuperCellMult(0.3);
		getOperation().setCellCost(100);
		getOperation().setMoneyCost(2);
	}
}
