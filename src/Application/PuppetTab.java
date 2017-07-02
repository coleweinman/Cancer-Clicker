package Application;

import javax.swing.JPanel;
import javax.swing.JList;
import net.miginfocom.swing.MigLayout;

public class PuppetTab extends JPanel {
	public PuppetTab() {
		setLayout(new MigLayout("", "[grow][grow][grow][grow][grow][grow][grow]", "[grow][grow][grow][grow][grow][grow]"));
		
		JList list = new JList();
		add(list, "cell 1 1 5 4,grow");
	}

}
