package Game.Operations;

import Game.OperationData;

public class Office extends Operation {
	
	public Office() {
		super("Office");
		setPrice(OperationData.Office.getPrice());
		setCapacity(OperationData.Office.getSpace());
		setCellCost(OperationData.Office.getCellCost());
		setMoneyCost(OperationData.Office.getMoneyCost());
	}
}
