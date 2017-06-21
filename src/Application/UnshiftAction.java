package Application;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class UnshiftAction extends AbstractAction {
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e) {
		CellShopTab.unshift();
	}
}
