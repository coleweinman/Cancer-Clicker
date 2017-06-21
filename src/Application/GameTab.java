package Application;

import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.Action;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;

import net.miginfocom.swing.MigLayout;

public class GameTab extends JPanel {
	private JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JPanel tabCellShop = new CellShopTab();
	private JPanel tabMoneyTab = new MoneyTab();
	private JPanel tabPuppet = new PuppetTab();
	private JPanel tabOperations = new OperationsTab();
	
	public GameTab() {
		super();
		setLayout(new MigLayout("insets 0 0 0 0", "[grow][grow][grow][grow][grow][grow][grow]", "[grow][grow][grow][grow][grow][grow][grow][grow][][][grow][][grow][grow]"));
		
		add(tabbedPane, "cell 0 8 7 6,grow");
		
		tabbedPane.addTab("Cell Shop", tabCellShop);

		tabbedPane.addTab("Money Tab", tabMoneyTab);
		
		tabbedPane.addTab("Puppet Panel", tabPuppet);
		
		tabbedPane.addTab("Operations", tabOperations);
		
		JLabel lblCells = new JLabel("0");
		lblCells.setFont(new Font("Tahoma", Font.PLAIN, 40));
		add(lblCells, "cell 1 2 5 2,alignx center,aligny center");
		
		
		
		
	}
}
