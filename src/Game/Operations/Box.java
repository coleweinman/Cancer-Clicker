package Game.Operations;

import Game.OperationData;

public class Box extends Operation {
	
	public Box() {
		super("Box");
		setPrice(OperationData.Box.getPrice());
		setSpace(OperationData.Box.getSpace());
		setCellCost(OperationData.Box.getCellCost());
		setMoneyCost(OperationData.Box.getMoneyCost());
	}
}
