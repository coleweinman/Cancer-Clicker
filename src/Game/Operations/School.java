package Game.Operations;

import Game.OperationData;

public class School extends Operation {
	
	public School() {
		super("School");
		setPrice(OperationData.School.getPrice());
		setSpace(OperationData.School.getSpace());
		setCellMult(OperationData.School.getCellMult());
		setMoneyMult(OperationData.School.getMoneyMult());
		setSuperCellMult(OperationData.School.getSuperCellMult());
	}
}
