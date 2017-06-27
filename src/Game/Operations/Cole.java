package Game.Operations;

import Game.OperationData;

public class Cole extends Operation {
	
	public Cole() {
		super("Cole");
		setPrice(OperationData.Cole.getPrice());
		setCellCost(OperationData.Cole.getCellCost());
		setMoneyCost(OperationData.Cole.getMoneyCost());
		setSpace(OperationData.Cole.getSpace());
		setCellMult(OperationData.Cole.getCellMult());
		setMoneyMult(OperationData.Cole.getMoneyMult());
		setSuperCellMult(OperationData.Cole.getSuperCellMult());
	}
}
