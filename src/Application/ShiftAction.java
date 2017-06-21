package Application;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ShiftAction extends AbstractAction {
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e) {
		CellShopTab.shift();
	}
}
